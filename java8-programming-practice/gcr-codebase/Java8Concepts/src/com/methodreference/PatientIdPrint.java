package com.methodreference;

import java.util.*;

public class PatientIdPrint {

	public static void main(String[] args) {

		List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

		// Using method reference
		patientIds.forEach(System.out::println);
	}
}
