package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex85 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(2);
		list.add(25);

		if (list.isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		int max = list.getFirst();
		int min = list.getFirst();

		for (int num : list) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
