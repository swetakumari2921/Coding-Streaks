package my.arrays.practice;

import java.util.Scanner;

// 17. Remove duplicate elements from an array.

public class Ex16 {
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

		// Remove duplicates
		int newSize = 0;
		int[] temp = new int[size]; // temporary array to store unique elements

		for (int i = 0; i < size; i++) {
			boolean isDuplicate = false;

			// Check if arr[i] already exists in temp
			for (int j = 0; j < newSize; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If not duplicate, add to temp
			if (!isDuplicate) {
				temp[newSize] = arr[i];
				newSize++;
			}
		}

		System.out.println("\nArray after removing duplicates: ");
		for (int i = 0; i < newSize; i++) {
			System.out.print(temp[i] + " ");
		}

		sc.close();
	}
}
