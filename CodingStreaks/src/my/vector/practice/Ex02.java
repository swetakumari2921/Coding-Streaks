package my.vector.practice;

import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(40);
		vector.add(50);

		System.out.println("Before insertion: " + vector);

		int index = 2;
		int element = 30;

		// Insert element at given index
		vector.insertElementAt(element, index);

		System.out.println("After insertion: " + vector);
	}
}
