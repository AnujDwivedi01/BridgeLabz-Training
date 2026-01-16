package com.sorting.cropmonitor;

public class CropMonitorQuickSort {

	// Quick Sort method
	public static void quickSort(SensorReading[] data, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(data, low, high);

			quickSort(data, low, pivotIndex - 1); // Left side
			quickSort(data, pivotIndex + 1, high); // Right side
		}
	}

	// Partition method based on timestamp
	private static int partition(SensorReading[] data, int low, int high) {
		long pivot = data[high].timestamp;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (data[j].timestamp < pivot) {
				i++;
				SensorReading temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}

		SensorReading temp = data[i + 1];
		data[i + 1] = data[high];
		data[high] = temp;

		return i + 1;
	}

	// Main method
	public static void main(String[] args) {
		SensorReading[] readings = { new SensorReading(1700003400L, 28.5), new SensorReading(1700001200L, 26.8),
				new SensorReading(1700005600L, 29.1), new SensorReading(1700002100L, 27.4) };

		System.out.println("Before Sorting:");
		printReadings(readings);

		quickSort(readings, 0, readings.length - 1);

		System.out.println("\nAfter Sorting by Timestamp:");
		printReadings(readings);
	}

	// Utility method to print readings
	private static void printReadings(SensorReading[] data) {
		for (SensorReading r : data) {
			System.out.println("Time: " + r.timestamp + " | Temp: " + r.temperature + "°C");
		}
	}
}