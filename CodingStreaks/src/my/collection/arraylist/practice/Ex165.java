package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex165 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of ArrayList: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter K: ");
		int k = sc.nextInt();

		boolean found = false;

		System.out.println("Pairs with difference " + k + ":");

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (Math.abs(list.get(i) - list.get(j)) == k) {
					System.out.println("(" + list.get(i) + ", " + list.get(j) + ")");
					found = true;
				}
			}
		}

		if (!found) {
			System.out.println("No pairs found");
		}

		sc.close();
	}
}
