package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex36 {

	public static LinkedList<Integer> reverseInGroups(LinkedList<Integer> list, int k) {
		LinkedList<Integer> result = new LinkedList<>();
		int n = list.size();

		for (int i = 0; i < n; i += k) {
			int end = Math.min(i + k, n);
			for (int j = end - 1; j >= i; j--) {
				result.add(list.get(j));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes in linked list: ");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter " + n + " node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter group size k: ");
		int k = sc.nextInt();

		LinkedList<Integer> reversedList = reverseInGroups(list, k);

		System.out.println("Linked list after reversing in groups of " + k + ":");
		for (int val : reversedList) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
