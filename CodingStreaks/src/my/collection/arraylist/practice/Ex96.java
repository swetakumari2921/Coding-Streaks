package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex96 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j)) && !result.contains(list1.get(i))) {
					result.add(list1.get(i));
				}
			}
		}

		System.out.println(result);
	}
}
