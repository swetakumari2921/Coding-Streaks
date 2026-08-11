package my.vector.practice;

import java.util.Vector;

public class Ex41 {

	static int firstRepeatingElement(Vector<Integer> vector) {

		for (int i = 0; i < vector.size(); i++) {

			for (int j = i + 1; j < vector.size(); j++) {

				if (vector.get(i).equals(vector.get(j))) {
					return vector.get(i);
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(5);
		vector.add(3);
		vector.add(4);
		vector.add(3);
		vector.add(5);

		int result = firstRepeatingElement(vector);

		if (result == -1) {
			System.out.println("No repeating element");
		} else {
			System.out.println("First repeating element: " + result);
		}
	}
}
