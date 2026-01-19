package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> borrowedBooks = new ArrayList<>();

		System.out.println("===== Welcome to Library Book Loan System =====");

		// Borrow books
		System.out.print("Enter number of books to borrow: ");
		int borrowCount = sc.nextInt();
		sc.nextLine(); // consume newline

		for (int i = 0; i < borrowCount; i++) {
			System.out.print("Enter book name to borrow: ");
			String bookName = sc.nextLine();

			if (borrowedBooks.contains(bookName)) {
				System.out.println("Book already borrowed: " + bookName);
			} else {
				borrowedBooks.add(bookName);
				System.out.println("Book borrowed successfully: " + bookName);
			}
		}

		// Return books
		System.out.print("\nEnter number of books to return: ");
		int returnCount = sc.nextInt();
		sc.nextLine(); // consume newline

		for (int i = 0; i < returnCount; i++) {
			System.out.print("Enter book name to return: ");
			String returnBook = sc.nextLine();

			if (borrowedBooks.contains(returnBook)) {
				borrowedBooks.remove(returnBook);
				System.out.println("Book returned successfully: " + returnBook);
			} else {
				System.out.println("Book not found in borrowed list: " + returnBook);
			}
		}

		// Display borrowed books
		System.out.println("\n===== Currently Borrowed Books =====");

		if (borrowedBooks.isEmpty()) {
			System.out.println("No books are currently borrowed.");
		} else {
			for (int i = 0; i < borrowedBooks.size(); i++) {
				System.out.print(borrowedBooks.get(i));
				if (i < borrowedBooks.size() - 1) {
					System.out.print(", ");
				}
			}
		}

		sc.close();
	}
}
