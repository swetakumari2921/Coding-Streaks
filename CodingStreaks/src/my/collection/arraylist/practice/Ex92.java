package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex92 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int first = list.get(0);

		for (int i = 0; i < list.size() - 1; i++) {
			list.set(i, list.get(i + 1));
		}

		list.set(list.size() - 1, first);

		System.out.println(list);
	}
}
