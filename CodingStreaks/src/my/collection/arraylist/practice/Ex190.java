package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex190 {

	static void findDuplicates(ArrayList<Integer> list) {
		boolean found = false;

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).equals(list.get(i + 1))) {
				System.out.println(list.get(i));
				found = true;

				// Skip all duplicate occurrences
				while (i < list.size() - 1 && list.get(i).equals(list.get(i + 1))) {
					i++;
				}
			}
		}

		if (!found) {
			System.out.println("No duplicates found.");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);

		System.out.println("Duplicate elements:");
		findDuplicates(list);
	}
}
