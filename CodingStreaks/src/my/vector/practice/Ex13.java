package my.vector.practice;

import java.util.Vector;

public class Ex13 {

	// Check if an element exists in the vector
	static boolean containsElement(Vector<Integer> vector, int key) {

		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i) == key) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		int key = 30;

		System.out.println("Vector: " + vector);

		if (containsElement(vector, key)) {
			System.out.println(key + " exists in the vector.");
		} else {
			System.out.println(key + " does not exist in the vector.");
		}
	}
}
