package my.vector.practice;

import java.util.Vector;

public class Ex30 {

	public static int findMissing(Vector<Integer> vec, int n) {
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : vec) {
			actualSum += num;
		}

		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();

		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(5);
		vec.add(6);

		int n = 6;

		System.out.println("Missing Number: " + findMissing(vec, n));
	}
}
