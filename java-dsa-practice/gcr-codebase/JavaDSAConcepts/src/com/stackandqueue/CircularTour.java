package com.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    // Inner class to represent a petrol pump
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    // Method to find starting petrol pump
    public static int findStartingPoint(PetrolPump[] pumps) {

        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int start = 0;
        int n = pumps.length;

        for (int i = 0; i < n; i++) {

            queue.add(i);
            surplus += pumps[i].petrol - pumps[i].distance;

            // Remove pumps while petrol becomes insufficient
            while (surplus < 0 && !queue.isEmpty()) {
                int removedIndex = queue.poll();
                surplus -= (pumps[removedIndex].petrol - pumps[removedIndex].distance);
                start = removedIndex + 1;
            }
        }

        // If all pumps are included in queue, tour is possible
        if (queue.size() == n) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int startPoint = findStartingPoint(pumps);

        if (startPoint != -1) {
            System.out.println("Start tour from petrol pump index: " + startPoint);
        } else {
            System.out.println("No possible circular tour");
        }
    }
}


