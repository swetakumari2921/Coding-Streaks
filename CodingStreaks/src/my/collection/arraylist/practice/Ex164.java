package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of ArrayList: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter k: ");
		int k = sc.nextInt();

		ArrayList<Integer> diffs = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				diffs.add(Math.abs(list.get(i) - list.get(j)));
			}
		}

		Collections.sort(diffs);

		if (k >= 1 && k <= diffs.size()) {
			System.out.println("K-th Smallest Difference = " + diffs.get(k - 1));
		} else {
			System.out.println("Invalid k");
		}

		sc.close();
	}
}
