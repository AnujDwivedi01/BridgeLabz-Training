package com.streams;

import java.io.*;

public class StudentDataStream {

	public static void main(String[] args) {

		String fileName = "D:\\filehandling\\file10.txt";

		// 🔹 Writing data using DataOutputStream
		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream(fileName));

			int rollNo = 101;
			String name = "Anuj Dwivedi";
			double gpa = 8.6;

			dos.writeInt(rollNo);
			dos.writeUTF(name);
			dos.writeDouble(gpa);

			System.out.println("Student data written successfully.");

		} catch (IOException e) {
			System.out.println("Error while writing data.");
			e.printStackTrace();

		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				System.out.println("Error while closing output stream.");
			}
		}

		// 🔹 Reading data using DataInputStream
		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream(fileName));

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			System.out.println("\nStudent Data Retrieved:");
			System.out.println("Roll No : " + rollNo);
			System.out.println("Name    : " + name);
			System.out.println("GPA     : " + gpa);

		} catch (IOException e) {
			System.out.println("Error while reading data.");
			e.printStackTrace();

		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				System.out.println("Error while closing input stream.");
			}
		}
	}
}
