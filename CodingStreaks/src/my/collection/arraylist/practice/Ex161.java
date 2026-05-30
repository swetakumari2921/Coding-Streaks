package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter sorted elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Missing ranges:");

		for (int i = 0; i < list.size() - 1; i++) {

			int current = list.get(i);
			int next = list.get(i + 1);

			if (next - current > 1) {

				int start = current + 1;
				int end = next - 1;

				if (start == end) {
					System.out.println(start);
				} else {
					System.out.println(start + " -> " + end);
				}
			}
		}

		sc.close();
	}
}
