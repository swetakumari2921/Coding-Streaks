package my.arrays.practice;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int min = findMinimum(arr, n);

		System.out.println("Minimum element: " + min);
	}

	static int findMinimum(int[] arr, int n) {

		int low = 0;
		int high = n - 1;

		while (low < high) {

			int mid = (low + high) / 2;

			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return arr[low];
	}
}
