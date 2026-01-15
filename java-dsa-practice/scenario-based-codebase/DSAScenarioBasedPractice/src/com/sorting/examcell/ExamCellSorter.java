package com.sorting.examcell;

public class ExamCellSorter {

	// divide method
	public void divide(Student[] arr, int si, int ei) {

		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;

		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	// conquer (merge) method
	public void conquer(Student[] arr, int si, int mid, int ei) {

		Student[] merged = new Student[ei - si + 1];

		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		// merge in descending order (higher score = better rank)
		while (idx1 <= mid && idx2 <= ei) {

			if (arr[idx1].getScore() >= arr[idx2].getScore()) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	// display ranked list
	public void display(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Rank " + (i + 1) + ": " + students[i]);
		}
	}
}
