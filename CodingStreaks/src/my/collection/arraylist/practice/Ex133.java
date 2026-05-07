package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex133 {

	public static int lastOccurrence(ArrayList<Integer> list, int target) {

		for (int i = list.size() - 1; i >= 0; i--) {

			if (list.get(i) == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);

		int target = 20;

		int index = lastOccurrence(list, target);

		System.out.println("Last occurrence index = " + index);
	}
}
