package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		int minAbsSum = Integer.MAX_VALUE;
		int start = 0, end = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum += arr.get(j);

				if (Math.abs(sum) < minAbsSum) {
					minAbsSum = Math.abs(sum);
					start = i;
					end = j;
				}
			}
		}

		System.out.println("Subarray with Minimum Absolute Sum:");
		for (int i = start; i <= end; i++) {
			System.out.print(arr.get(i) + " ");
		}

		System.out.println("\nMinimum Absolute Sum: " + minAbsSum);
	}
}
