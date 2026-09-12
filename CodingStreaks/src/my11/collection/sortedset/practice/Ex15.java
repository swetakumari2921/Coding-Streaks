package my11.collection.sortedset.practice;

import java.util.*;

public class Ex15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SortedSet<Integer> number = new TreeSet<>();

		System.out.println("Enter 10 integers:");

		for (int i = 1; i <= 10; i++) {
			number.add(sc.nextInt());
		}

		System.out.println("SortedSet: " + number);

		sc.close();
	}
}
