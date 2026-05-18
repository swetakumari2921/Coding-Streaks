package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex148 {

	public static void shiftEvenIndices(ArrayList<Integer> list) {

		ArrayList<Integer> result = new ArrayList<>();

		// Add even index elements first
		for (int i = 0; i < list.size(); i += 2) {
			result.add(list.get(i));
		}

		// Add odd index elements
		for (int i = 1; i < list.size(); i += 2) {
			result.add(list.get(i));
		}

		System.out.println(result);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		shiftEvenIndices(list);
	}
}
