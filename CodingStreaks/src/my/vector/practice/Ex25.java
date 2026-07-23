package my.vector.practice;

import java.util.Vector;

public class Ex25 {

	public static Integer findSecondSmallest(Vector<Integer> vector) {
		if (vector.size() < 2) {
			return null;
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : vector) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num > smallest && num < secondSmallest) {
				secondSmallest = num;
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			return null; // No second distinct smallest element
		}

		return secondSmallest;
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(15);
		vector.add(8);
		vector.add(22);
		vector.add(5);
		vector.add(10);
		vector.add(5);

		Integer result = findSecondSmallest(vector);

		if (result != null) {
			System.out.println("Second smallest element: " + result);
		} else {
			System.out.println("Second smallest element does not exist.");
		}
	}
}