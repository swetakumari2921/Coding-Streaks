package my.vector.practice;

import java.util.Vector;
import java.util.Scanner;

public class Ex20 {

	public static void rotateRight(Vector<Integer> vec, int k) {

		int n = vec.size();

		if (n == 0) {
			return;
		}

		k = k % n;

		Vector<Integer> temp = new Vector<>();

		// Store last k elements
		for (int i = n - k; i < n; i++) {
			temp.add(vec.get(i));
		}

		// Store remaining elements
		for (int i = 0; i < n - k; i++) {
			temp.add(vec.get(i));
		}

		// Copy back to original vector
		for (int i = 0; i < n; i++) {
			vec.set(i, temp.get(i));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Vector<Integer> vec = new Vector<>();

		for (int i = 0; i < n; i++) {
			vec.add(sc.nextInt());
		}

		int k = sc.nextInt();

		rotateRight(vec, k);

		System.out.println(vec);

		sc.close();
	}
}
