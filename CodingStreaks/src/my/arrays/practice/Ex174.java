package my.arrays.practice;

import java.util.Scanner;

public class Ex174 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter value of k:");
		int k = sc.nextInt();

		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] ^ arr[j]) == k) {
					count++;
				}
			}
		}

		System.out.println("Count of pairs = " + count);

		sc.close();
	}
}
