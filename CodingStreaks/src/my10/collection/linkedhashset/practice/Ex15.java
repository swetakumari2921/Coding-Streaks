package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedHashSet<String> name = new LinkedHashSet<>();

		System.out.println("Enter 5 Strings:");

		for (int i = 1; i <= 5; i++) {
			name.add(sc.nextLine());
		}

		System.out.println("LinkedHashSet: " + name);

		sc.close();
	}
}
