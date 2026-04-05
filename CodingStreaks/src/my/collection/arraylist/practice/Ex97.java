package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex97 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(2);
		list2.add(4);
		list2.add(5);

		for (int i = 0; i < list1.size(); i++) {
			if (!union.contains(list1.get(i))) {
				union.add(list1.get(i));
			}
		}

		for (int i = 0; i < list2.size(); i++) {
			if (!union.contains(list2.get(i))) {
				union.add(list2.get(i));
			}
		}

		for (int i = 0; i < union.size(); i++) {
			System.out.print(union.get(i) + " ");
		}
	}
}
