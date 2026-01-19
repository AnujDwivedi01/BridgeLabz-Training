package com.setinterface.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();          // Fast lookup
    Set<Policy> linkedHashSet = new LinkedHashSet<>(); // Insertion order
    Set<Policy> treeSet = new TreeSet<>();          // Sorted by expiry date

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // 1️⃣ Retrieve all unique policies
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }

    // 2️⃣ Policies expiring within next 30 days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // 3️⃣ Policies by coverage type
    public void policiesByCoverage(String coverage) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    // 4️⃣ Detect duplicate policy numbers
    public void findDuplicates(List<Policy> policies) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Duplicate Policies:");

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }
}
