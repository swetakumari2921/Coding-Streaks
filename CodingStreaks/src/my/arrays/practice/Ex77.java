package my.arrays.practice;

import java.util.Scanner;

public class Ex77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] freq = new int[n + 1];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}

		int missing = -1;
		int repeating = -1;

		for (int i = 1; i <= n; i++) {
			if (freq[i] == 0) {
				missing = i;
			}
			if (freq[i] == 2) {
				repeating = i;
			}
		}

		System.out.println("Missing Number: " + missing);
		System.out.println("Repeating Number: " + repeating);
	}
}
