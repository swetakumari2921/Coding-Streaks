package my.arrays.practice;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.print("Enter subarray size k: ");
		int k = sc.nextInt();

		for (int i = 0; i <= n - k; i++) {
			int max = arr[i];
			for (int j = i; j < i + k; j++) {
				if (arr[j] > max)
					max = arr[j];
			}
			System.out.print(max + " ");
		}
	}
}
