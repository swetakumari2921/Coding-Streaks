package my.vector.practice;

import java.util.Vector;

public class Ex111 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		int key = 30;
		boolean found = false;

		for (int i = 0; i < vector.size(); i++) {

			if (vector.get(i) == key) {
				System.out.println("Element found at index: " + i);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found.");
		}
	}
}
