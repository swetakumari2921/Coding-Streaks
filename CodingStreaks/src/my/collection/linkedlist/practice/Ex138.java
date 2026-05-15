package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex138 {

	static boolean isStrictlyDecreasing(LinkedList<Integer> list) {
		if (list.size() <= 1) {
			return true;
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) <= list.get(i + 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(9);
		list.add(7);
		list.add(5);
		list.add(2);

		if (isStrictlyDecreasing(list)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
