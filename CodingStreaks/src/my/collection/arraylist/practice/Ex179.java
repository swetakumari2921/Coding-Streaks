package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex179 {

	public static ArrayList<String> compress(ArrayList<Integer> list) {
		ArrayList<String> result = new ArrayList<>();

		if (list.size() == 0) {
			return result;
		}

		int count = 1;

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).equals(list.get(i - 1))) {
				count++;
			} else {
				result.add(list.get(i - 1) + "" + count);
				count = 1;
			}
		}

		result.add(list.get(list.size() - 1) + "" + count);

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);

		ArrayList<String> result = compress(list);

		System.out.println(result);
	}
}
