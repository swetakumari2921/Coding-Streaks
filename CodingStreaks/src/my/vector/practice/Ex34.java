package my.vector.practice;

import java.util.Vector;

public class Ex34 {

	static void swap(Vector<Integer> vector, int index1, int index2) {
		if (index1 < 0 || index2 < 0 || index1 >= vector.size() || index2 >= vector.size()) {
			System.out.println("Invalid indices.");
			return;
		}

		int temp = vector.get(index1);
		vector.set(index1, vector.get(index2));
		vector.set(index2, temp);
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("Original Vector: " + vector);

		swap(vector, 1, 3);

		System.out.println("Vector after swapping: " + vector);
	}
}
