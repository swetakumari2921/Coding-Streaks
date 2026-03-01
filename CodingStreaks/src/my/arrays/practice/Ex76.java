package my.arrays.practice;

import java.util.Scanner;

public class Ex76 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of days:");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter stock prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		if (n == 0) {
			System.out.println("Maximum Profit: 0");
			return;
		}

		int[] buy = new int[n];
		int[] sell = new int[n];
		int[] cooldown = new int[n];

		buy[0] = -prices[0];
		sell[0] = 0;
		cooldown[0] = 0;

		for (int i = 1; i < n; i++) {

			if (i == 1) {
				buy[i] = Math.max(buy[i - 1], -prices[i]);
			} else {
				buy[i] = Math.max(buy[i - 1], cooldown[i - 1] - prices[i]);
			}

			sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
			cooldown[i] = sell[i - 1];
		}

		System.out.println("Maximum Profit: " + sell[n - 1]);

		sc.close();
	}
}
