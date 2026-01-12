package my.arrays.practice;

import java.util.Scanner;

// Move all zeros to the beginning of the array.

public class Ex27 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[n];
		int index = 0;

		// Step 1: Add zeros
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				result[index++] = 0;
			}
		}

		// Step 2: Add non-zero elements
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				result[index++] = arr[i];
			}
		}

		System.out.println("Array after moving zeros to beginning:");
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}

		sc.close();
	}
}
