package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex76 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(8);
		list.add(4);
		list.add(2);
		list.add(1);

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					count++;
				}
			}
		}

		System.out.println("Total Inversions: " + count);
	}
}
