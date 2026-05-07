package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex134 {

	public static boolean areEqual(ArrayList<Integer> a, ArrayList<Integer> b) {

		if (a.size() != b.size()) {
			return false;
		}

		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) != b.get(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(1);
		list2.add(2);
		list2.add(3);

		boolean result = areEqual(list1, list2);

		System.out.println(result);
	}
}