package my11.collection.sortedset.practice;

import java.util.*;

public class Ex17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SortedSet<Integer> number = new TreeSet<>();

		System.out.println("Enter 5 numbers:");

		for (int i = 1; i <= 5; i++) {
			number.add(sc.nextInt());
		}

		System.out.println("Even numbers:");

		for (Integer n : number) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

		sc.close();
	}
}
