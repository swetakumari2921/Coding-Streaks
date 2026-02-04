package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex31 {

	public static void deleteNAfterM(LinkedList<Integer> list, int M, int N) {
		int index = 0;
		while (index < list.size()) {
			index += M;
			for (int i = 0; i < N && index < list.size(); i++) {
				list.remove(index);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter M (nodes to keep):");
		int M = sc.nextInt();

		System.out.println("Enter N (nodes to delete):");
		int N = sc.nextInt();

		deleteNAfterM(list, M, N);

		System.out.println("Updated Linked List:");
		for (int val : list) {
			System.out.print(val + " ");
		}
	}
}
