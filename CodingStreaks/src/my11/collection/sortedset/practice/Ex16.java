package my11.collection.sortedset.practice;

import java.util.*;

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SortedSet<String> name = new TreeSet<>();

		System.out.println("Enter 5 Strings:");

		for (int i = 1; i <= 5; i++) {
			name.add(sc.nextLine());
		}

		System.out.println("SortedSet: " + name);

		sc.close();
	}
}
