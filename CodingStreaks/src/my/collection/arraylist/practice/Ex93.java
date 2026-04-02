package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex93 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		if (!list.isEmpty()) {
			int last = list.remove(list.size() - 1);
			list.add(0, last);
		}

		System.out.println(list);
	}
}
