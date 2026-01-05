package com.sorting;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {

    public static void insertionSort(int[] ids) {

        int n = ids.length;

        // Insertion Sort logic
        for (int i = 1; i < n; i++) {

            int key = ids[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextInt();
        }

        insertionSort(empIds);

        System.out.println("Sorted Employee IDs (Ascending Order):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}

