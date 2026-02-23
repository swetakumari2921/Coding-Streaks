package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int maxSum = list.getFirst();
		int currentSum = list.getFirst();

		for (int value : list) {
			currentSum = Math.max(value, currentSum + value);
			maxSum = Math.max(maxSum, currentSum);
		}

		System.out.println("Maximum sum of contiguous subarray: " + maxSum);
	}
}
