package my.vector.practice;

import java.util.Collections;
import java.util.Vector;

public class Ex19 {

	public static void rotateLeft(Vector<Integer> vector, int k) {
		int n = vector.size();

		if (n == 0)
			return;

		k = k % n;

		reverse(vector, 0, k - 1);
		reverse(vector, k, n - 1);
		reverse(vector, 0, n - 1);
	}

	private static void reverse(Vector<Integer> vector, int start, int end) {
		while (start < end) {
			Collections.swap(vector, start, end);
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);

		int k = 2;

		System.out.println("Original Vector: " + vector);

		rotateLeft(vector, k);

		System.out.println("After Left Rotation: " + vector);
	}
}
