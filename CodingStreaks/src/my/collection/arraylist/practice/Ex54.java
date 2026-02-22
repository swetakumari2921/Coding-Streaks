package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

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
