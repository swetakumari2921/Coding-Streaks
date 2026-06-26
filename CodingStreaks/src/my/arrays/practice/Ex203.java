package my.arrays.practice;

import java.util.Scanner;

public class Ex203 {

	static int minOperations(int arr[]) {
		int min = arr[0];

		// Find minimum element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// Count operations
		int operations = 0;
		for (int i = 0; i < arr.length; i++) {
			operations += (arr[i] - min);
		}

		return operations;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Minimum Operations = " + minOperations(arr));
	}
}
