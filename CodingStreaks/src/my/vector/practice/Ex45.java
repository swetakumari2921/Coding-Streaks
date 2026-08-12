package my.vector.practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex45 {

	public static void rotate(Vector<Integer> vector, int k) {

		int n = vector.size();

		if (n == 0) {
			return;
		}

		k = k % n;

		// Store last k elements
		Vector<Integer> temp = new Vector<>();

		for (int i = n - k; i < n; i++) {
			temp.add(vector.get(i));
		}

		// Shift remaining elements to the right
		for (int i = n - k - 1; i >= 0; i--) {
			vector.set(i + k, vector.get(i));
		}

		// Put last k elements at the beginning
		for (int i = 0; i < k; i++) {
			vector.set(i, temp.get(i));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> vector = new Vector<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			vector.add(sc.nextInt());
		}

		System.out.print("Enter k: ");
		int k = sc.nextInt();

		System.out.println("Before rotation: " + vector);

		rotate(vector, k);

		System.out.println("After rotation: " + vector);

		sc.close();
	}
}
