package my.vector.practice;

import java.util.Vector;

public class Ex46 {

	public static void rearrange(Vector<Integer> vector) {

		Vector<Integer> positive = new Vector<>();
		Vector<Integer> negative = new Vector<>();

		// Separate positive and negative numbers
		for (int value : vector) {
			if (value >= 0) {
				positive.add(value);
			} else {
				negative.add(value);
			}
		}

		vector.clear();

		int i = 0;
		int j = 0;

		// Add positive and negative alternately
		while (i < positive.size() && j < negative.size()) {
			vector.add(positive.get(i++));
			vector.add(negative.get(j++));
		}

		// Add remaining positive numbers
		while (i < positive.size()) {
			vector.add(positive.get(i++));
		}

		// Add remaining negative numbers
		while (j < negative.size()) {
			vector.add(negative.get(j++));
		}
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(2);
		vector.add(-3);
		vector.add(-4);
		vector.add(5);
		vector.add(-6);
		vector.add(7);

		System.out.println("Before: " + vector);

		rearrange(vector);

		System.out.println("After:  " + vector);
	}
}
