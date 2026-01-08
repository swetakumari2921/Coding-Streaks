package my.arrays.practice;

// 24. Find missing number in 1 to n.

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array (n-1): ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements from 1 to " + (n + 1) + " with one missing:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int total = (n + 1) * (n + 2) / 2;
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}

		int missing = total - sum;
		System.out.println("Missing number is: " + missing);
	}
}
