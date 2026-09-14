package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<String> name = new LinkedList<>();

		System.out.println("Enter 5 Strings:");

		for (int i = 1; i <= 5; i++) {
			name.add(sc.nextLine());
		}

		int count = 0;

		for (int i = 0; i < name.size(); i++) {

			if (name.indexOf(name.get(i)) == i) {
				count++;
			}
		}

		System.out.println("Number of unique Strings: " + count);

		sc.close();
	}
}
