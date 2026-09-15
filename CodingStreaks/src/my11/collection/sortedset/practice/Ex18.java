package my11.collection.sortedset.practice;

import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SortedSet<Integer> set = new TreeSet<>();

		System.out.println("Enter 5 integers:");

		for (int i = 0; i < 5; i++) {
			set.add(sc.nextInt());
		}

		System.out.println("Odd numbers:");

		for (int n : set) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
	}
}
