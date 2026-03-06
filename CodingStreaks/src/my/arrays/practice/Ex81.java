package my.arrays.practice;

import java.util.Scanner;

public class Ex81 {

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

		for (int i = 0; i < n; i++) {
			int xor = 0;

			for (int j = i; j < n; j++) {
				xor = xor ^ arr[j];

				if (xor == k) {
					count++;
				}
			}
		}

		System.out.println("Number of subarrays with XOR = " + k + " is: " + count);
	}
}