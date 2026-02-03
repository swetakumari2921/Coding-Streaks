package my.collection.arraylist.practice;

import java.util.Scanner;

class Node {
	String data;
	Node next;

	Node(String data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex35 {

	public static Node deleteLastOccurrence(Node head, String item) {
		Node lastOccur = null;
		Node current = head;
		Node prevToLast = null;
		Node prev = null;

		while (current != null) {
			if (current.data.equals(item)) {
				lastOccur = current;
				prevToLast = prev;
			}
			prev = current;
			current = current.next;
		}

		if (lastOccur == null) {
			System.out.println("Item \"" + item + "\" not found in the list.");
			return head;
		}

		if (prevToLast == null) {
			head = head.next;
		} else {
			prevToLast.next = lastOccur.next;
		}

		System.out.println("Deleted last occurrence of \"" + item + "\".");
		return head;
	}

	public static void printList(Node head) {
		Node temp = head;
		System.out.println("\nUpdated Linked List:");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of tasks: ");
		int n = Integer.parseInt(sc.nextLine());

		if (n <= 0) {
			System.out.println("No tasks to process.");
			return;
		}

		Node head = null;
		Node tail = null;

		System.out.println("Enter tasks:");
		for (int i = 0; i < n; i++) {
			String task = sc.nextLine();
			Node newNode = new Node(task);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		System.out.print("Enter task to delete: ");
		String item = sc.nextLine();

		head = deleteLastOccurrence(head, item);
		printList(head);
	}
}
