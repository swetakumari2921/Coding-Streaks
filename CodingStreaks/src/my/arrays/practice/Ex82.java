package my.arrays.practice;

import java.util.Scanner;

public class Ex82 {

	public static int maxXOR(int[] arr, int n) {

		int max = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int xor = arr[i] ^ arr[j];

				if (xor > max)
					max = xor;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = maxXOR(arr, n);

		System.out.println("Maximum XOR: " + result);
	}
}
