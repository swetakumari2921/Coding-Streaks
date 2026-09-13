package my09.collection.hashset.practice;

import java.util.*;

public class Ex16 {
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
