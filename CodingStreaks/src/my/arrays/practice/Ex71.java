package my.arrays.practice;

import java.util.Scanner;

public class Ex71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int k = 1; k <= n; k++) {
			int maxOfMin = Integer.MIN_VALUE;

			for (int i = 0; i <= n - k; i++) {
				int min = arr[i];

				for (int j = i; j < i + k; j++) {
					if (arr[j] < min) {
						min = arr[j];
					}
				}

				if (min > maxOfMin) {
					maxOfMin = min;
				}
			}

			System.out.print(maxOfMin + " ");
		}
	}
}
