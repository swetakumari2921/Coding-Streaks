package my.vector.practice;

import java.util.Vector;

public class Ex08 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		// vector.add(10);
		// vector.add(20);

		if (vector.isEmpty()) {
			System.out.println("Vector is empty");
		} else {
			System.out.println("Vector is not empty");
		}
	}
}
