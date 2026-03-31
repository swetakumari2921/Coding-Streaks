package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex91 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(9);
		list.add(1);
		list.add(7);

		int min = list.get(0);
		int max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < min)
				min = list.get(i);
			if (list.get(i) > max)
				max = list.get(i);
		}

		System.out.println("Smallest element: " + min);
		System.out.println("Largest element: " + max);
	}
}
