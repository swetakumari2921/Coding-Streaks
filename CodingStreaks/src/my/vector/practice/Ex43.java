package my.vector.practice;

import java.util.Vector;
import java.util.Collections;

public class Ex43 {

	static int kthLargest(Vector<Integer> vector, int k) {

		if (k <= 0 || k > vector.size()) {
			throw new IllegalArgumentException("Invalid value of k");
		}

		// Sort in descending order
		Collections.sort(vector, Collections.reverseOrder());

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

		int result = kthLargest(vector, k);

		System.out.println("K-th largest element: " + result);
	}
}
