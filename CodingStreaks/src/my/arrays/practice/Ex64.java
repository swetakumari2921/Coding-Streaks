package my.arrays.practice;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] inc = new int[n];
		int[] dec = new int[n];

		for (int i = 0; i < n; i++)
			inc[i] = 1;
		for (int i = n - 1; i >= 0; i--)
			dec[i] = 1;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && inc[i] < inc[j] + 1) {
					inc[i] = inc[j] + 1;
				}
			}
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = n - 1; j > i; j--) {
				if (arr[i] > arr[j] && dec[i] < dec[j] + 1) {
					dec[i] = dec[j] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < inc[i] + dec[i] - 1)
				max = inc[i] + dec[i] - 1;
		}

		System.out.println("Length of Longest Bitonic Subsequence: " + max);
	}
}
