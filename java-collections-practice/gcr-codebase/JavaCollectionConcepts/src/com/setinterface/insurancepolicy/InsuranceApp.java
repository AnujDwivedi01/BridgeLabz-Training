package com.setinterface.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class InsuranceApp {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		Policy p1 = new Policy(101, "Anuj", LocalDate.now().plusDays(10), "Health", 5000);
		Policy p2 = new Policy(102, "Ravi", LocalDate.now().plusDays(40), "Auto", 3000);
		Policy p3 = new Policy(103, "Neha", LocalDate.now().plusDays(20), "Home", 7000);
		Policy p4 = new Policy(101, "Anuj", LocalDate.now().plusDays(10), "Health", 5000); // Duplicate

		manager.addPolicy(p1);
		manager.addPolicy(p2);
		manager.addPolicy(p3);
		manager.addPolicy(p4);

		System.out.println("\nAll Unique Policies:");
		manager.displayAllPolicies();

		System.out.println("\nPolicies Expiring Soon:");
		manager.policiesExpiringSoon();

		System.out.println("\nHealth Coverage Policies:");
		manager.policiesByCoverage("Health");

		System.out.println("\nDuplicate Check:");
		manager.findDuplicates(Arrays.asList(p1, p2, p3, p4));
	}
}
