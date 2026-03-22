package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node27 {
	int data;
	Node27 next;

	Node27(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex77 {

	static Node27 head = null;

	public static void insertAtBeginning(int data) {
		Node27 newNode = new Node27(data);

		newNode.next = head;
		head = newNode;
	}

	public static void display() {
		Node27 temp = head;

		System.out.print("LinkedList: ");
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter value to insert at beginning: ");
			int val = sc.nextInt();
			insertAtBeginning(val);
		}

		System.out.println("\nFinal LinkedList after insertions at beginning:");
		display();
	}
}
