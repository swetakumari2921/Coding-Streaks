package my.arrays.practice;

import java.util.Scanner;

public class Ex74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of days:");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter stock prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		int minPrice = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < n; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				int profit = prices[i] - minPrice;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}

		System.out.println("Maximum Profit is: " + maxProfit);
	}
}
