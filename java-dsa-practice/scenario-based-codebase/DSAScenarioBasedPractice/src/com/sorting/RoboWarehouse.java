package com.sorting;
import java.util.Scanner;

public class RoboWarehouse {

    // Insertion Sort method
    public static void insertionSort(int[] weights) {
        for (int i = 1; i < weights.length; i++) {
            int currentPackage = weights[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > currentPackage) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert package at correct position
            weights[j + 1] = currentPackage;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        insertionSort(weights);

        System.out.println("Shelf after loading (Ascending Order):");
        for (int w : weights) {
            System.out.print(w + " ");
        }

        sc.close();
    }
}
