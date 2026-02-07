package my.collection.linkedlist.practice;

import java.util.*;

class Node8 {
	int data;
	Node8 next;

	Node8(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter linked list elements (0,1,2 without spaces): ");
		String input = sc.nextLine();

		Node8 head = new Node8(input.charAt(0) - '0');
		Node8 current = head;
		for (int i = 1; i < n; i++) {
			current.next = new Node8(input.charAt(i) - '0');
			current = current.next;
		}

		int count0 = 0, count1 = 0, count2 = 0;
		current = head;
		while (current != null) {
			if (current.data == 0)
				count0++;
			else if (current.data == 1)
				count1++;
			else
				count2++;
			current = current.next;
		}

		current = head;
		while (count0-- > 0) {
			current.data = 0;
			current = current.next;
		}
		while (count1-- > 0) {
			current.data = 1;
			current = current.next;
		}
		while (count2-- > 0) {
			current.data = 2;
			current = current.next;
		}

		System.out.print("Sorted Linked List: ");
		current = head;
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
		}
	}
}
