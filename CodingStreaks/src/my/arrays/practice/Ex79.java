package my.arrays.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Ex79 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (n == 0) {
			System.out.println("Longest consecutive sequence length: 0");
			return;
		}

		Arrays.sort(arr);

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 1; i < n; i++) {

			if (arr[i] == arr[i - 1]) {
				continue; // ignore duplicate
			} else if (arr[i] == arr[i - 1] + 1) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
				}
				currentLength = 1;
			}
		}

		if (currentLength > maxLength) {
			maxLength = currentLength;
		}

		System.out.println("Longest consecutive sequence length: " + maxLength);
	}
}