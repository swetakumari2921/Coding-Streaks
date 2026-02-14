package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex41 {

	public static Node reverseSublist(Node head, int m, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;

		for (int i = 1; i < m; i++) {
			prev = prev.next;
		}

		Node curr = prev.next;
		Node next = null;
		Node tail = curr;

		for (int i = 0; i <= n - m; i++) {
			Node temp = curr.next;
			curr.next = next;
			next = curr;
			curr = temp;
		}

		prev.next = next;
		tail.next = curr;

		return dummy.next;
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		System.out.println("Enter node values:");
		Node head = null;
		Node tail = null;
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			Node newNode = new Node(val);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		System.out.println("Enter start position m and end position n to reverse:");
		int m = sc.nextInt();
		int p = sc.nextInt();

		if (m < 1 || p > n || m > p) {
			System.out.println("Invalid positions");
			return;
		}

		head = reverseSublist(head, m, p);

		System.out.println("Linked list after reversing sublist:");
		printList(head);
	}
}
