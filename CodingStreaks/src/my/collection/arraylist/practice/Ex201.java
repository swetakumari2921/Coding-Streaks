package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex201 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(6);
		list.add(2);
		list.add(6);
		list.add(6);
		list.add(4);
		list.add(2);
		list.add(2);

		for (int i = 0; i < list.size(); i++) {

			int count = 0;

			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println("Unique Element = " + list.get(i));
				return;
			}
		}

		System.out.println("No unique element found.");
	}
}
