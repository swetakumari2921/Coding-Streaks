package my.vector.practice;

import java.util.Vector;

public class Ex27 {

	public static boolean findPair(Vector<Integer> vector, int target) {

		for (int i = 0; i < vector.size() - 1; i++) {
			for (int j = i + 1; j < vector.size(); j++) {

				if (vector.get(i) + vector.get(j) == target) {
					System.out.println("Pair found: " + vector.get(i) + " " + vector.get(j));
					return true;
				}
			}
		}

		System.out.println("No pair found.");
		return false;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(2);
		vector.add(7);
		vector.add(11);
		vector.add(15);
		vector.add(5);

		int target = 9;

		findPair(vector, target);
	}
}
