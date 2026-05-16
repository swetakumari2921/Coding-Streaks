package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex139 {

	public static boolean isStrictlyDecreasing(LinkedList<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i) <= list.get(i + 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		if (isStrictlyDecreasing(list)) {
			System.out.println("Strictly Decreasing");
		} else {
			System.out.println("Not Strictly Decreasing");
		}

		sc.close();
	}
}
