package my.arrays.practice;

import java.util.Scanner;

// 20. Find the sum of even-indexed and odd-indexed elements separately.

public class Ex19 {
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

		int evenSum = 0; // sum of elements at even indices
		int oddSum = 0; // sum of elements at odd indices

		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				evenSum += arr[i]; // even index
			} else {
				oddSum += arr[i]; // odd index
			}
		}

		System.out.println("Sum of even-indexed elements: " + evenSum);
		System.out.println("Sum of odd-indexed elements: " + oddSum);

		sc.close();
	}
}
