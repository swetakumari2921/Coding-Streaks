package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();

		System.out.print("Enter number of elements in first linked list: ");
		int n1 = sc.nextInt();

		System.out.println("Enter elements of first linked list:");
		for (int i = 0; i < n1; i++) {
			list1.add(sc.nextInt());
		}

		System.out.print("Enter number of elements in second linked list: ");
		int n2 = sc.nextInt();

		System.out.println("Enter elements of second linked list:");
		for (int i = 0; i < n2; i++) {
			list2.add(sc.nextInt());
		}

		int intersection = -1;

		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				intersection = list1.get(i);
				break;
			}
		}

		if (intersection != -1)
			System.out.println("Intersection point value: " + intersection);
		else
			System.out.println("No intersection found");
	}
}
