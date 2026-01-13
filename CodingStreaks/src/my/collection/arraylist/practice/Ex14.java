package my.collection.arraylist.practice;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of school supplies: ");
		int n = sc.nextInt();

		ArrayList<String> supplies = new ArrayList<>();

		System.out.println("Enter the school supplies:");
		for (int i = 0; i < n; i++) {
			supplies.add(sc.next());
		}

		System.out.print("Enter number of purchased items: ");
		int m = sc.nextInt();

		System.out.println("Enter the purchased items:");
		for (int i = 0; i < m; i++) {
			String item = sc.next();
			supplies.remove(item);
		}

		System.out.println("Remaining school supplies to buy:");
		for (int i = 0; i < supplies.size(); i++) {
			System.out.print(supplies.get(i));
			if (i < supplies.size() - 1) {
				System.out.print(", ");
			}
		}
		sc.close();
	}
}
