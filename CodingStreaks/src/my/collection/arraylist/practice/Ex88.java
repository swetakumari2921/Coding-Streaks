package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex88 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(12);

		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != 0) {
				result.add(list.get(i));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				result.add(0);
			}
		}

		System.out.println(result);
	}
}
