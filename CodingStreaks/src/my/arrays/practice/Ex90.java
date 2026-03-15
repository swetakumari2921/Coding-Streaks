package my.arrays.practice;

import java.util.Scanner;

public class Ex90 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter value of k:");
		int k = sc.nextInt();

		int count = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int l = j + 1; l < n; l++) {

					if (arr[i] + arr[j] + arr[l] == k) {
						count++;
					}
				}
			}
		}

		System.out.println("Number of triplets: " + count);
	}
}