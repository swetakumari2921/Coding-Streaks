package my.vector.practice;

import java.util.Vector;

public class Ex32 {

	public static void replaceElement(Vector<Integer> vector, int oldValue, int newValue) {
		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i) == oldValue) {
				vector.set(i, newValue);
			}
		}
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(20);
		vector.add(40);

		System.out.println("Original Vector: " + vector);

		replaceElement(vector, 20, 99);

		System.out.println("Updated Vector: " + vector);
	}
}
