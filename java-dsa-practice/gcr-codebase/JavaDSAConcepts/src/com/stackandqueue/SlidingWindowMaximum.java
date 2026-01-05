package com.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static void printMax(int[] arr, int k) {

        if (arr == null || k <= 0) {
            return;
        }

        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove elements outside current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current element index
            dq.offerLast(i);

            // Print max once first window is complete
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.print("Sliding Window Maximums: ");
        printMax(arr, k);
    }
}
