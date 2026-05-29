package my.arrays.practice;

import java.util.Scanner;

public class Ex172 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxXor = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;

		for (int i = 0; i < n; i++) {

			int xor = 0;

			for (int j = i; j < n; j++) {

				xor = xor ^ arr[j];

				if (xor > maxXor) {
					maxXor = xor;
					start = i;
					end = j;
				}
			}
		}

		System.out.println("Maximum XOR: " + maxXor);

		System.out.print("Subarray: ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
