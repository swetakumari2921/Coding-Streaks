package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex20 {

	public static void firstNegative(int[] arr, int k) {

		Queue<Integer> queue = new LinkedList<>();

		int n = arr.length;

		// Store indexes of negative numbers
		for (int i = 0; i < n; i++) {

			if (arr[i] < 0) {
				queue.add(i);
			}

			// Remove elements outside current window
			if (!queue.isEmpty() && queue.peek() <= i - k) {
				queue.remove();
			}

			// Print answer after window is formed
			if (i >= k - 1) {

				if (queue.isEmpty()) {
					System.out.print("0 ");
				} else {
					System.out.print(arr[queue.peek()] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		firstNegative(arr, k);

		sc.close();
	}
}
