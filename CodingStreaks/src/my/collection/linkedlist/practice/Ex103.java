package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex103 {

	public static void zigZag(LinkedList<Integer> list) {
		boolean flag = true;

		for (int i = 0; i < list.size() - 1; i++) {
			int a = list.get(i);
			int b = list.get(i + 1);

			if (flag) {
				if (a > b) {
					list.set(i, b);
					list.set(i + 1, a);
				}
			} else {
				if (a < b) {
					list.set(i, b);
					list.set(i + 1, a);
				}
			}

			flag = !flag;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(1);

		zigZag(list);

		System.out.println(list);
	}
}
