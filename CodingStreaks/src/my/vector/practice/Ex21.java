package my.vector.practice;

import java.util.Vector;
import java.util.Scanner;

public class Ex21 {

	public static void removeDuplicates(Vector<Integer> vec) {

		Vector<Integer> unique = new Vector<>();

		for (int i = 0; i < vec.size(); i++) {

			if (!unique.contains(vec.get(i))) {
				unique.add(vec.get(i));
			}
		}

		vec.clear();
		vec.addAll(unique);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Vector<Integer> vec = new Vector<>();

		for (int i = 0; i < n; i++) {
			vec.add(sc.nextInt());
		}

		removeDuplicates(vec);

		System.out.println(vec);

		sc.close();
	}
}
