package my.collection.arraylist.practice;

import java.util.Scanner;

class Node2 {
	int data;
	Node2 next;

	Node2(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex36 {

	public static Node2 deleteNAfterM(Node2 head, int M, int N) {
		Node2 current = head;

		while (current != null) {

			for (int i = 1; i < M && current != null; i++) {
				current = current.next;
			}

			if (current == null) {
				break;
			}

			Node2 temp = current.next;
			for (int i = 0; i < N && temp != null; i++) {
				temp = temp.next;
			}

			current.next = temp;

			current = temp;
		}

		return head;
	}

	public static void printList(Node2 head) {
		Node2 temp = head;
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
		Node2 head = null;
		Node2 tail = null;

		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			Node2 newNode = new Node2(val);

			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		System.out.println("Enter M (nodes to keep):");
		int M = sc.nextInt();

		System.out.println("Enter N (nodes to delete):");
		int N = sc.nextInt();

		head = deleteNAfterM(head, M, N);

		System.out.println("Updated Linked List:");
		printList(head);
	}
}
