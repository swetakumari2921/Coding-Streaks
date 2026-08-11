package my.vector.practice;

import java.util.Collections;
import java.util.Vector;

public class Ex44 {

	static int kthSmallest(Vector<Integer> vector, int k) {

		if (k <= 0 || k > vector.size()) {
			throw new IllegalArgumentException("Invalid value of k");
		}

		// Sort in ascending order
		Collections.sort(vector);

		return vector.get(k - 1);
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(5);
		vector.add(20);
		vector.add(8);
		vector.add(15);

		int k = 3;

		int result = kthSmallest(vector, k);

		System.out.println("K-th smallest element: " + result);
	}
}
