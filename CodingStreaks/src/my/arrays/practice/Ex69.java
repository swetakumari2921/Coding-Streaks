package my.arrays.practice;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of first array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];

		System.out.println("Enter elements of first sorted array:");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of second array:");
		int m = sc.nextInt();
		int[] arr2 = new int[m];

		System.out.println("Enter elements of second sorted array:");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] merged = new int[n + m];

		int i = 0, j = 0, k = 0;

		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}
		}

		while (i < n) {
			merged[k++] = arr1[i++];
		}

		while (j < m) {
			merged[k++] = arr2[j++];
		}

		int total = n + m;

		System.out.println("Median is:");
		if (total % 2 == 0) {
			double median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
			System.out.println(median);
		} else {
			System.out.println(merged[total / 2]);
		}
	}
}