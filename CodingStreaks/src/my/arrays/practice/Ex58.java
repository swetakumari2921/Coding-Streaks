package my.arrays.practice;

import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int peak = -1;

		if (n == 1) {
			peak = arr[0];
		} else {
			for (int i = 0; i < n; i++) {

				if (i == 0) {
					if (arr[i] > arr[i + 1]) {
						peak = arr[i];
						break;
					}
				} else if (i == n - 1) {
					if (arr[i] > arr[i - 1]) {
						peak = arr[i];
						break;
					}
				} else {
					if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
						peak = arr[i];
						break;
					}
				}
			}
		}

		if (peak != -1) {
			System.out.println("Peak Element: " + peak);
		} else {
			System.out.println("No Peak Element Found");
		}
	}
}
