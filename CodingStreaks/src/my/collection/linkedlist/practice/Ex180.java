package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex180 {

	// Bubble Sort for LinkedList
	static void bubbleSort(LinkedList<Integer> list) {
		int n = list.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

	static void findKSmallest(LinkedList<Integer> list, int k) {
		bubbleSort(list);

		System.out.println("K Smallest Elements:");
		for (int i = 0; i < k && i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<>();

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter k: ");
		int k = sc.nextInt();

		findKSmallest(list, k);

		sc.close();
	}
}
