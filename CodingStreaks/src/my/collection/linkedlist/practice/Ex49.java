package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int maxSoFar = list.get(0);
		int maxEnding = list.get(0);

		for (int i = 1; i < n; i++) {
			int x = list.get(i);

			if (maxEnding + x > x) {
				maxEnding = maxEnding + x;
			} else {
				maxEnding = x;
			}

			if (maxEnding > maxSoFar) {
				maxSoFar = maxEnding;
			}
		}

		System.out.println("Maximum sum is:");
		System.out.println(maxSoFar);
	}
}
