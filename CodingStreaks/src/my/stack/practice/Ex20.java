package my.stack.practice;

import java.util.Stack;
import java.util.Scanner;

public class Ex20 {

	public static int[] stockSpan(int[] prices) {

		int n = prices.length;
		int[] span = new int[n];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {

			// Remove smaller or equal prices
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}

			// Calculate span
			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}

			// Store current index
			stack.push(i);
		}

		return span;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] prices = new int[n];

		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		int[] result = stockSpan(prices);

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}

		sc.close();
	}
}
