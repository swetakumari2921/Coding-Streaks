package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

class Book {
	String title;
	int id;

	Book(String title, int id) {
		this.title = title;
		this.id = id;
	}
}

public class Ex35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Book> books = new LinkedList<>();

		System.out.print("Enter number of books: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter book title: ");
			String title = sc.nextLine();
			System.out.print("Enter book ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			books.add(new Book(title, id));
		}

		System.out.print("Enter ID of book to delete: ");
		int deleteId = sc.nextInt();

		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).id == deleteId) {
				books.remove(i);
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Book deleted.");
		} else {
			System.out.println("Book not found.");
		}
	}
}
