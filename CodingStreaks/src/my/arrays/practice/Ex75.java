package my.arrays.practice;

import java.util.Scanner;

public class Ex75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of days:");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter stock prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		int profit = 0;

		for (int i = 1; i < n; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}
		}

		System.out.println("Maximum Profit: " + profit);
	}
}
