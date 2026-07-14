package my.vector.practice;

import java.util.Vector;

public class Ex16 {

	static int findMin(Vector<Integer> vector) {

		int min = vector.get(0);

		for (int i = 1; i < vector.size(); i++) {

			if (vector.get(i) < min) {
				min = vector.get(i);
			}
		}

		return min;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(40);
		vector.add(10);
		vector.add(50);
		vector.add(5);
		vector.add(30);

		int result = findMin(vector);

		System.out.println("Minimum Element = " + result);
	}
}
