package my.arrays.practice;

import java.util.Scanner;

// Find the previous greater element for each element.

public class Ex52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for array: ");
		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Size should be positive.");
			return;
		}

		int[] arr = new int[size];
		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			int prevGreater = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					prevGreater = arr[j];
					break;
				}
			}
			result[i] = prevGreater;
		}

		System.out.println("Previous greater elements:");
		for (int i = 0; i < size; i++) {
			System.out.print(result[i] + " ");
		}
	}
}