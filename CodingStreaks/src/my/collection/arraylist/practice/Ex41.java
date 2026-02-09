package my.collection.arraylist.practice;

import java.util.Scanner;

class Node6 {
	int data;
	Node6 next;

	Node6(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex41 {

	public static Node6 reverseInGroups(Node6 head, int k) {
		Node6 prev = null;
		Node6 curr = head;
		Node6 next = null;
		int count = 0;

		Node6 temp = head;
		int nodesCount = 0;
		while (temp != null) {
			nodesCount++;
			temp = temp.next;
		}
		if (k <= 1 || head == null || nodesCount < k)
			return head;

		count = 0;
		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}

		if (next != null) {
			head.next = reverseInGroups(next, k);
		}

		return prev;
	}

	public static void printList(Node6 head) {
		Node6 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes in linked list: ");
		int n = sc.nextInt();
		Node6 head = null;
		Node6 tail = null;

		System.out.println("Enter " + n + " node values:");
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

		System.out.print("Enter group size k: ");
		int k = sc.nextInt();

		head = reverseInGroups(head, k);

		System.out.println("Linked list after reversing in groups of " + k + ":");
		printList(head);
	}
}
