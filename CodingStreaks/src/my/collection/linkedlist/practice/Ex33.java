package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node6 {
	int data;
	Node6 next;

	Node6(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of linked list: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Size should be positive.");
			return;
		}

		Node6 head = null, tail = null;
		System.out.println("Enter linked list elements:");
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			Node6 newNode = new Node6(val);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		Node6 temp = head;
		while (temp != null && temp.next != null) {
			int swap = temp.data;
			temp.data = temp.next.data;
			temp.next.data = swap;
			temp = temp.next.next;
		}

		System.out.println("Linked list after pairwise swap:");
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
