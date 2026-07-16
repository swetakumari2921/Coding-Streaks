package my.vector.practice;

import java.util.Vector;
import java.util.Scanner;

public class Ex18 {

	public static void reverseVector(Vector<Integer> vec) {

		int start = 0;
		int end = vec.size() - 1;

		while (start < end) {
			int temp = vec.get(start);
			vec.set(start, vec.get(end));
			vec.set(end, temp);

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of vector: ");
		int n = sc.nextInt();

		Vector<Integer> vec = new Vector<>();

		System.out.println("Enter vector elements:");
		for (int i = 0; i < n; i++) {
			vec.add(sc.nextInt());
		}

		reverseVector(vec);

		System.out.println("Reversed Vector:");
		for (int element : vec) {
			System.out.print(element + " ");
		}

		sc.close();
	}
}
