package my.arrays.practice;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] height = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		int[] left = new int[n];
		int[] right = new int[n];

		System.out.println("Processing...");

		left[0] = height[0];
		for (int i = 1; i < n; i++) {
			if (height[i] > left[i - 1]) {
				left[i] = height[i];
			} else {
				left[i] = left[i - 1];
			}
		}

		right[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (height[i] > right[i + 1]) {
				right[i] = height[i];
			} else {
				right[i] = right[i + 1];
			}
		}

		int water = 0;
		for (int i = 0; i < n; i++) {
			int min = left[i] < right[i] ? left[i] : right[i];
			if (min > height[i]) {
				water = water + (min - height[i]);
			}
		}

		System.out.println("Trapped water:");
		System.out.println(water);
	}
}
