package my.arrays.practice;

import java.util.Scanner;

// 25. Find duplicates in an array.

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int array = sc.nextInt();
		if (array <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		int[] arr = new int[array];
		for (int i = 0; i < array; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array: ");
		for (int i = 0; i < array; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("Duplicate elements: ");
		boolean found = false;

		for (int i = 0; i < array; i++) {
			for (int j = i + 1; j < array; j++) {
				if (arr[i] == arr[j]) {
					boolean alreadyPrinted = false;
					for (int k = 0; k < i; k++) {
						if (arr[k] == arr[i]) {
							alreadyPrinted = true;
							break;
						}
					}
					if (!alreadyPrinted) {
						System.out.print(arr[i] + " ");
						found = true;
					}
				}
			}
		}

		if (!found) {
			System.out.println("No duplicates found");
		}

		sc.close();
	}
}
