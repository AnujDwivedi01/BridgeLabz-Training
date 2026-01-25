package com.resumeanalyzer;

import java.io.*;

public class ResumeReader {

	public static String readTextFile(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append(" ");
			}
		}
		return sb.toString();
	}
}
