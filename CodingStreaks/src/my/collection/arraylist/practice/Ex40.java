package my.collection.arraylist.practice;

import java.util.Scanner;

class BookNode {
	String title;
	int id;
	BookNode next;

	BookNode(String title, int id) {
		this.title = title;
		this.id = id;
		this.next = null;
	}
}

public class Ex40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of books: ");
		int n = sc.nextInt();
		sc.nextLine();

		BookNode head = null;
		BookNode tail = null;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter book title: ");
			String title = sc.nextLine();
			System.out.print("Enter book ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			BookNode newNode = new BookNode(title, id);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		System.out.print("Enter ID of book to delete: ");
		int deleteId = sc.nextInt();

		if (head == null) {
			System.out.println("Book not found.");
			return;
		}

		if (head.id == deleteId) {
			head = head.next;
			System.out.println("Book deleted.");
			return;
		}

		BookNode current = head;
		while (current.next != null && current.next.id != deleteId) {
			current = current.next;
		}

		if (current.next == null) {
			System.out.println("Book not found.");
		} else {
			current.next = current.next.next;
			System.out.println("Book deleted.");
		}
	}
}
