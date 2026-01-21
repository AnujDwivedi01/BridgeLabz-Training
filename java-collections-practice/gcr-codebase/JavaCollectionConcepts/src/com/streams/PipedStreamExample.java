package com.streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

	public static void main(String[] args) {

		try {
			// Create piped streams
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			// Create threads
			Thread writerThread = new Thread(new Writer(pos));
			Thread readerThread = new Thread(new Reader(pis));

			writerThread.start();
			readerThread.start();

		} catch (IOException e) {
			System.out.println("Error connecting piped streams.");
			e.printStackTrace();
		}
	}
}

// 🔹 Writer Thread
class Writer implements Runnable {

	private PipedOutputStream pos;

	public Writer(PipedOutputStream pos) {
		this.pos = pos;
	}

	@Override
	public void run() {
		try {
			String message = "Hello from Writer Thread";

			pos.write(message.getBytes());
			pos.close();

		} catch (IOException e) {
			System.out.println("Error in writer thread.");
			e.printStackTrace();
		}
	}
}

// 🔹 Reader Thread
class Reader implements Runnable {

	private PipedInputStream pis;

	public Reader(PipedInputStream pis) {
		this.pis = pis;
	}

	@Override
	public void run() {
		try {
			int data;
			System.out.print("Reader received: ");

			while ((data = pis.read()) != -1) {
				System.out.print((char) data);
			}

			pis.close();

		} catch (IOException e) {
			System.out.println("Error in reader thread.");
			e.printStackTrace();
		}
	}
}
