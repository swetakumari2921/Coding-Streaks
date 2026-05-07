package my.collection.linkedlist.practice;

import java.util.ArrayList;

public class Ex128 {

	public static void findCommon(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		System.out.println("Common Elements:");

		for (int i = 0; i < list1.size(); i++) {

			int value = list1.get(i);

			for (int j = 0; j < list2.size(); j++) {

				if (value == list2.get(j)) {

					System.out.println(value);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		findCommon(list1, list2);
	}
}
