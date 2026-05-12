package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex140 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		int sum = 0;

		for (int i = 1; i < list.size(); i += 2) {
			sum += list.get(i);
		}

		System.out.println("Sum of elements at odd indices: " + sum);
	}
}
