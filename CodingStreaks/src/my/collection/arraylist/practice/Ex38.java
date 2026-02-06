package my.collection.arraylist.practice;

import java.util.Scanner;

class Node5 {
	int data;
	Node5 next;

	Node5(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of linked list: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Size should be positive.");
			return;
		}

		Node5 head = null, tail = null;
		System.out.println("Enter linked list elements:");
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			Node5 newNode = new Node5(val);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		Node5 temp = head;
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
