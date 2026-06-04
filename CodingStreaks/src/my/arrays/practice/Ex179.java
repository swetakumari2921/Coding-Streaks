package my.arrays.practice;

import java.util.Scanner;

public class Ex179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxLen = 1;
		int currLen = 1;
		int start = 0;
		int maxStart = 0;

		for (int i = 1; i < n; i++) {

			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {

				currLen++;

				if (currLen > maxLen) {
					maxLen = currLen;
					maxStart = start;
				}

			} else {
				currLen = 1;
				start = i;
			}
		}

		System.out.println("Longest Alternating Even-Odd Subarray Length = " + maxLen);

		System.out.print("Subarray: ");
		for (int i = maxStart; i < maxStart + maxLen; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
