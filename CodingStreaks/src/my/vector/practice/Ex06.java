package my.vector.practice;

import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("Original Vector: " + vector);

		// Update element at index 2
		vector.set(2, 100);

		System.out.println("Updated Vector: " + vector);
	}
}
