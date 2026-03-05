package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node12 {
	int data;
	Node12 next;

	Node12(int data) {
		this.data = data;
	}
}

public class Ex60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		Node12 head = null, tail = null;
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			Node12 newNode = new Node12(sc.nextInt());
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		Node12 slow = head;
		Node12 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println("Middle node: " + (slow != null ? slow.data : "List is empty"));
	}
}
