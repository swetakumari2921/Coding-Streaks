package my.arrays.practice;

import java.util.Scanner;

// Move all zeros to the end of the array.

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		// 🔹 Logic: move zeros to the end
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}

		while (index < n) {
			arr[index] = 0;
			index++;
		}

		// 🔹 Output
		System.out.println("Array after moving zeros to end:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
