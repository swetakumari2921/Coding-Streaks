package my09.collection.hashset.practice;

import java.util.*;

public class Ex17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<String> name = new HashSet<>();

		System.out.println("Enter 5 Strings:");

		for (int i = 1; i <= 5; i++) {
			name.add(sc.nextLine());
		}

		System.out.println("Number of unique Strings: " + name.size());

		sc.close();
	}
}
