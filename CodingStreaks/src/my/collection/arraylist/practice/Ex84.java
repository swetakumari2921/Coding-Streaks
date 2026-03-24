package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex84 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);

		removeDuplicates(list);

		System.out.println(list); // Output: [1, 2, 3]
	}

	public static void removeDuplicates(ArrayList<Integer> list) {
		if (list.size() == 0)
			return;

		int i = 0;

		while (i < list.size() - 1) {
			if (list.get(i).equals(list.get(i + 1))) {
				list.remove(i + 1); // remove duplicate
			} else {
				i++;
			}
		}
	}
}
