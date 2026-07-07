package my.vector.practice;

import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("Vector elements:");

		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
	}
}
