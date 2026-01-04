package my.arrays.practice;

import java.util.*;

// 16. Rotate an array by k positions.

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		if (size <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter rotation value (positive = right, negative = left): ");
		int k = sc.nextInt();

		k = k % size;

		if (k < 0) {
			k = k + size;
		}

		for (int r = 0; r < k; r++) {
			int last = arr[size - 1];

			for (int i = size - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		}
		System.out.println("Rotated Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
