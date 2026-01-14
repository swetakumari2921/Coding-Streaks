package my.arrays.practice;

import java.util.Scanner;

// Find the smallest positive missing number.

public class Ex29 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean[] present = new boolean[n + 1];

		// Mark existing positive numbers
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0 && arr[i] <= n) {
				present[arr[i]] = true;
			}
		}

		// Find the smallest missing positive
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				System.out.println("Smallest missing positive number: " + i);
				sc.close();
				return;
			}
		}

		// If all numbers from 1 to n are present
		System.out.println("Smallest missing positive number: " + (n + 1));

		sc.close();
	}
}
