package my.arrays.practice;

import java.util.Scanner;

// 19. Check if an array contains a given element.

public class Ex18 {
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

		System.out.println("\nEnter element to search: ");
		int target = sc.nextInt();

		boolean found = false;

		// Linear search
		for (int i = 0; i < size; i++) {
			if (arr[i] == target) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Element " + target + " is present in the array.");
		} else {
			System.out.println("Element " + target + " is not present in the array.");
		}

		sc.close();
	}
}
