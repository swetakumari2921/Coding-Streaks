package my08.collection.set.practice;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<String> name = new HashSet<>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter String " + i + ": ");
			name.add(sc.nextLine());
		}

		System.out.println("Set: " + name);

		sc.close();
	}
}
