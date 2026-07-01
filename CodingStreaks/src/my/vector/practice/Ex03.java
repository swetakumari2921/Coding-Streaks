package my.vector.practice;

import java.util.Vector;

public class Ex03 {

	public static void removeByIndex(Vector<Integer> vector, int index) {

		if (index < 0 || index >= vector.size()) {
			System.out.println("Invalid Index");
			return;
		}

		vector.remove(index);

		System.out.println("Vector after removal:");
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		int index = 2;

		removeByIndex(vector, index);
	}
}
