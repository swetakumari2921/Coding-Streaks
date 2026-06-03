package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<>();

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				list.remove(i);
			}
		}

		System.out.println("LinkedList after removing nodes at even indices:");
		System.out.println(list);

		sc.close();
	}
}
