package my.arrays.practice;

import java.util.Scanner;

// Replace every element with the product of all other elements (without division).
public class Ex33 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] left = new int[n];
		int[] right = new int[n];
		int[] result = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Step 1: Build left product array
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}

		// Step 2: Build right product array
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}

		// Step 3: Build result array
		for (int i = 0; i < n; i++) {
			result[i] = left[i] * right[i];
		}

		// Output result
		System.out.println("Result array:");
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
		
		sc.close();
	}
}
