package my.arrays.practice;

import java.util.Scanner;

public class Ex73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (n <= 1) {
			System.out.println("Minimum number of jumps: 0");
			return;
		}

		if (arr[0] == 0) {
			System.out.println("Not possible to reach the end");
			return;
		}

		int maxReach = arr[0];
		int step = arr[0];
		int jump = 1;

		for (int i = 1; i < n; i++) {
			if (i == n - 1) {
				System.out.println("Minimum number of jumps: " + jump);
				return;
			}

			if (i + arr[i] > maxReach) {
				maxReach = i + arr[i];
			}

			step--;

			if (step == 0) {
				jump++;

				if (i >= maxReach) {
					System.out.println("Not possible to reach the end");
					return;
				}

				step = maxReach - i;
			}
		}
	}
}
