package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex136 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("Original ArrayList:");
		System.out.println(list);

		// Find middle index
		int middle = list.size() / 2;

		// Delete middle element
		list.remove(middle);

		System.out.println("After Deleting Middle Element:");
		System.out.println(list);
	}
}
