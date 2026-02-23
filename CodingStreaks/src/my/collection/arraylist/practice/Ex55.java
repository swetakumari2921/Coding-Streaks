package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int maxSum = list.get(0);
		int currentSum = list.get(0);

		for (int i = 1; i < n; i++) {
			int value = list.get(i);
			currentSum = Math.max(value, currentSum + value);
			maxSum = Math.max(maxSum, currentSum);
		}

		System.out.println("Maximum sum of contiguous subarray: " + maxSum);
	}
}
