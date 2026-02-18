package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		LinkedList<Integer> rearranged = rearrangeOddEven(list);

		System.out.println("Rearranged linked list:");
		for (int i = 0; i < rearranged.size(); i++) {
			System.out.print(rearranged.get(i));
			if (i != rearranged.size() - 1)
				System.out.print(" ");
		}
	}

	static LinkedList<Integer> rearrangeOddEven(LinkedList<Integer> list) {
		LinkedList<Integer> oddList = new LinkedList<>();
		LinkedList<Integer> evenList = new LinkedList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0)
				oddList.add(list.get(i)); // odd-indexed in 1-based
			else
				evenList.add(list.get(i)); // even-indexed in 1-based
		}

		oddList.addAll(evenList);
		return oddList;
	}
}
