package my.stack.practice;

import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(40);
		vector.add(50);

		int index = 2;
		int element = 30;

		vector.add(index, element);

		System.out.println("Vector after insertion: " + vector);
	}
}
