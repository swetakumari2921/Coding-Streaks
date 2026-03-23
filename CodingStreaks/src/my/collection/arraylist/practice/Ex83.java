package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex83 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(9);
		list.add(7);
		list.add(9);

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE)
			System.out.println("No second largest element");
		else
			System.out.println("Second largest element: " + second);
	}
}
