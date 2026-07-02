package my.vector.practice;

import java.util.Vector;

public class Ex04 {

	static void removeElement(Vector<Integer> vector, int value) {

		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i) == value) {
				vector.remove(i);
				return;
			}
		}

		System.out.println("Element not found.");
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("Original Vector: " + vector);

		int value = 30;
		removeElement(vector, value);

		System.out.println("Vector after removing " + value + ": " + vector);
	}
}
