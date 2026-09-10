package my08.collection.set.practice;

import java.util.*;

public class Ex13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		System.out.println("Enter 5 integers:");

		for (int i = 1; i <= 5; i++) {
			set.add(sc.nextInt());
		}

		System.out.println("Set: " + set);
	}
}
