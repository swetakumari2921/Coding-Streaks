package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes in first linked list:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements of first sorted linked list:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter number of nodes in second linked list:");
		int m = sc.nextInt();

		System.out.println("Enter elements of second sorted linked list:");
		for (int i = 0; i < m; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		System.out.println("Merged sorted linked list:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i != list.size() - 1) {
				System.out.print(" ");
			}
		}
	}
}
