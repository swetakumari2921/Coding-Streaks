package my.arrays.practice;

import java.util.Scanner;

public class Ex180 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] inc = new int[n];
		int[] dec = new int[n];

		inc[0] = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				inc[i] = inc[i - 1] + 1;
			} else {
				inc[i] = 1;
			}
		}

		dec[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				dec[i] = dec[i + 1] + 1;
			} else {
				dec[i] = 1;
			}
		}

		int maxLen = 1;
		int start = 0;
		int end = 0;

		for (int i = 0; i < n; i++) {
			int len = inc[i] + dec[i] - 1;

			if (len > maxLen) {
				maxLen = len;
				start = i - inc[i] + 1;
				end = i + dec[i] - 1;
			}
		}

		System.out.println("Maximum Length Bitonic Subarray = " + maxLen);

		System.out.print("Subarray: ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
