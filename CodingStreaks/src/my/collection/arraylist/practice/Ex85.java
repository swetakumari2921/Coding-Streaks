package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex85 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}

		System.out.println(list);
	}
}
