package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex135 {

	public static void insertMiddle(ArrayList<Integer> list, int value) {

		int middle = list.size() / 2;

		list.add(middle, value);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println("Before Insertion: " + list);

		insertMiddle(list, 99);

		System.out.println("After Insertion: " + list);
	}
}
