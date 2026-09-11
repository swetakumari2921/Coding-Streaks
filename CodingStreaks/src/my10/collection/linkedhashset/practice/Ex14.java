package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedHashSet<Integer> number = new LinkedHashSet<>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter integer " + i + ": ");
			number.add(sc.nextInt());
		}

		System.out.println("LinkedHashSet: " + number);

		sc.close();
	}
}
