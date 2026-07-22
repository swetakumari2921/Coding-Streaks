package my.vector.practice;

import java.util.Vector;

public class Ex24 {

	public static int findSecondLargest(Vector<Integer> vector) {
		if (vector.size() < 2) {
			throw new IllegalArgumentException("Vector must contain at least two elements.");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : vector) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest element exists.");
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(50);
		vector.add(30);
		vector.add(20);
		vector.add(40);

		int secondLargest = findSecondLargest(vector);

		System.out.println("Second Largest Element: " + secondLargest);
	}
}
