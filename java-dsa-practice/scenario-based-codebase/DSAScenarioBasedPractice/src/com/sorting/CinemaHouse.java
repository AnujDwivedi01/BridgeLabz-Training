package com.sorting;
import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort method
    public static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    // Swap
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter movie showtimes (in minutes):");
        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        bubbleSort(showTimes);

        System.out.println("Sorted Movie Showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }

        sc.close();
    }
}
