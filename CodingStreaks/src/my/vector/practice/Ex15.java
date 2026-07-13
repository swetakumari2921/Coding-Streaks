package my.vector.practice;

import java.util.Vector;

public class Ex15 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(25);
		vector.add(70);
		vector.add(15);
		vector.add(90);
		vector.add(40);

		if (vector.isEmpty()) {
			System.out.println("Vector is empty.");
			return;
		}

		int max = vector.get(0);

		for (int i = 1; i < vector.size(); i++) {
			if (vector.get(i) > max) {
				max = vector.get(i);
			}
		}

		System.out.println("Vector: " + vector);
		System.out.println("Maximum Element: " + max);
	}
}
