package my.arrays.practice;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Size should be positive.");
			return;
		}

		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int prevSmaller = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					prevSmaller = arr[j];
					break;
				}
			}
			result[i] = prevSmaller;
		}

		System.out.println("Previous smaller elements:");
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
