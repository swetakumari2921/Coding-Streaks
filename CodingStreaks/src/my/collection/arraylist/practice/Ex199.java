package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex199 {

	static int findOddOccurrence(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			int count = 0;

			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			if (count % 2 != 0) {
				return list.get(i);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(3);

		System.out.println("ArrayList: " + list);

		int result = findOddOccurrence(list);

		if (result != -1) {
			System.out.println("Element appearing odd number of times: " + result);
		} else {
			System.out.println("No element appears odd number of times.");
		}
	}
}
