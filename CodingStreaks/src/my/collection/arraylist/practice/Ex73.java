package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex73 {

	public static void findMajority(ArrayList<Integer> list) {

		int n = list.size();

		for (int i = 0; i < n; i++) {

			int count = 0;

			for (int j = 0; j < n; j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			if (count > n / 2) {
				System.out.println("Majority Element: " + list.get(i));
				return;
			}
		}

		System.out.println("No Majority Element");
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(2);

		findMajority(list);
	}
}
