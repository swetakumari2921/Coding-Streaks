package my.arrays.practice;

import java.util.Scanner;

public class Ex80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter window size k:");
		int k = sc.nextInt();

		System.out.println("Distinct elements in each window:");

		for (int i = 0; i <= n - k; i++) {

			int count = 0;

			for (int j = i; j < i + k; j++) {

				boolean isDistinct = true;

				for (int p = i; p < j; p++) {
					if (arr[p] == arr[j]) {
						isDistinct = false;
						break;
					}
				}

				if (isDistinct)
					count++;
			}

			System.out.println(count);
		}
	}
}