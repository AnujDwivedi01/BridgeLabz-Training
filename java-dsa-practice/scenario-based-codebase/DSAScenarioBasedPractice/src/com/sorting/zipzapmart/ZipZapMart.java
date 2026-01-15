package com.sorting.zipzapmart;

public class ZipZapMart {

	public static void mergeSort(SaleTransaction[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// divide
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// conquer
			merge(arr, left, mid, right);
		}
	}

	private static void merge(SaleTransaction[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		SaleTransaction[] L = new SaleTransaction[n1];
		SaleTransaction[] R = new SaleTransaction[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// merge elements
		while (i < n1 && j < n2) {
			if (L[i].date.compareTo(R[j].date) < 0 || (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		// copy elements
		while (i < n1)
			arr[k++] = L[i++];
		while (j < n2)
			arr[k++] = R[j++];

	}

	public static void display(SaleTransaction[] arr) {
        for (SaleTransaction s : arr) {
            System.out.println(s.date + " | ₹" + s.amount);
        }

}
}
