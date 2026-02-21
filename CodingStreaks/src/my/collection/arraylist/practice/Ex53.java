package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter target sum:");
		int target = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(i) + list.get(j) == target) {
					found = true;
					break;
				}
			}
			if (found)
				break;
		}

		System.out.println(found ? "True" : "False");
	}
}
