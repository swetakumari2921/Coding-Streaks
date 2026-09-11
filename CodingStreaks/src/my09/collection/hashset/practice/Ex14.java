package my09.collection.hashset.practice;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<Integer> number = new HashSet<>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter integer " + i + ": ");
			number.add(sc.nextInt());
		}

		System.out.println("HashSet: " + number);

		sc.close();
	}
}
