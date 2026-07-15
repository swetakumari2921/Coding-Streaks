package my.vector.practice;

import java.util.Vector;

public class Ex17 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		int sum = 0;

		for (int i = 0; i < vector.size(); i++) {
			sum += vector.get(i);
		}

		System.out.println("Vector: " + vector);
		System.out.println("Sum of elements = " + sum);
	}
}
