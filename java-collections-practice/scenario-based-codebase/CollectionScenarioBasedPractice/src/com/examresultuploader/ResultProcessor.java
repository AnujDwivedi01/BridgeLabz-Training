package com.examresultuploader;

import java.io.*;
import java.util.*;

public class ResultProcessor {

	public Map<String, List<Integer>> process(String filePath) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

		while ((line = br.readLine()) != null) {

			LineValidator.validate(line);

			String[] data = line.split(",");

			String subject = data[2];
			int marks = Integer.parseInt(data[3]);

			subjectMarksMap.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);
		}
		return subjectMarksMap;
	}
}
