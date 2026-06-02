package my.arrays.practice;

import java.util.Scanner;

public class Ex176 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int minDiff = arr[1] - arr[0];
		int first = arr[0];
		int second = arr[1];

		for (int i = 1; i < n - 1; i++) {
			int diff = arr[i + 1] - arr[i];

			if (diff < minDiff) {
				minDiff = diff;
				first = arr[i];
				second = arr[i + 1];
			}
		}

		System.out.println("Minimum Difference Pair: (" + first + ", " + second + ")");
		System.out.println("Minimum Difference: " + minDiff);

		sc.close();
	}
}
