package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex95 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		boolean sorted = true;

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				sorted = false;
				break;
			}
		}

		if (sorted)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
	}
}
