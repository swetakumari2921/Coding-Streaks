package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex212 {

	public static int josephus(LinkedList<Integer> list, int k) {
		int index = 0;

		while (list.size() > 1) {
			index = (index + k - 1) % list.size();
			list.remove(index);
		}

		return list.getFirst();
	}

	public static void main(String[] args) {
		int n = 7;
		int k = 3;

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		int survivor = josephus(list, k);

		System.out.println("Survivor: " + survivor);
	}
}
