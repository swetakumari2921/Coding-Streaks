package my.collection.arraylist.practice;

import java.util.Scanner;

class Node8 {
	int data;
	Node8 prev;
	Node8 next;

	Node8(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

public class Ex45 {

	static Node8 insert(Node8 head, int data) {
		Node8 newNode = new Node8(data);
		if (head == null)
			return newNode;

		Node8 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		return head;
	}

	static Node8 rotate(Node8 head, int k) {
		if (head == null || k == 0)
			return head;

		Node8 temp = head;
		int count = 1;

		while (count < k && temp != null) {
			temp = temp.next;
			count++;
		}

		if (temp == null)
			return head;

		Node8 newHead = temp.next;
		if (newHead == null)
			return head;

		newHead.prev = null;
		temp.next = null;

		Node8 tail = newHead;
		while (tail.next != null) {
			tail = tail.next;
		}

		tail.next = head;
		head.prev = tail;

		return newHead;
	}

	static void display(Node8 head) {
		Node8 temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		Node8 head = null;

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			head = insert(head, val);
		}

		System.out.println("Enter number of nodes to rotate:");
		int k = sc.nextInt();

		head = rotate(head, k);

		System.out.println("Doubly linked list after rotation:");
		display(head);
	}
}
