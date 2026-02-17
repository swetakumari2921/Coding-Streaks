package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		LinkedList<Integer> odd = new LinkedList<>();
		LinkedList<Integer> even = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 != 0)
				odd.add(list.get(i));
			else
				even.add(list.get(i));
		}

		odd.addAll(even);

		System.out.println("Rearranged linked list:");
		for (int val : odd) {
			System.out.print(val);
		}
	}
}
