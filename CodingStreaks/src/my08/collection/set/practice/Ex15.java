package my08.collection.set.practice;

import java.util.*;

public class Ex15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> number = new HashSet<>();

		System.out.println("Enter 5 numbers:");

		for (int i = 1; i <= 5; i++) {
			number.add(sc.nextInt());
		}

		System.out.println("Number of unique numbers: " + number.size());

		sc.close();
	}
}
