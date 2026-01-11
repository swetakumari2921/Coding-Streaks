package my.collection.linkedlist.practice;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		List<Integer> list = new LinkedList<>();
		System.out.println("Enter the elements one by one:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter the element to add at the beginning: ");
		int element = sc.nextInt();

		list.add(0, element);

		System.out.println("Updated LinekedList:");
		for (int num : list) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
