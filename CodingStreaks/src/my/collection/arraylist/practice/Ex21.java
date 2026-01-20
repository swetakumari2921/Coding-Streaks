package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> books = new ArrayList<>();
		ArrayList<Integer> quantities = new ArrayList<>();

		System.out.println("Welcome to the Bookstore Order System!");

		System.out.print("Enter number of books to order: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter book name: ");
			String book = sc.next();
			System.out.print("Enter quantity: ");
			int qty = sc.nextInt();
			books.add(book);
			quantities.add(qty);
			System.out.println("Added " + book + " with quantity " + qty);
		}

		System.out.print("\nEnter number of updates/removals: ");
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			System.out.print("Enter book name to update/remove: ");
			String book = sc.next();
			System.out.print("Enter new quantity or 'remove' to delete: ");
			String action = sc.next();

			if (books.contains(book)) {
				int index = books.indexOf(book);

				if (action.equalsIgnoreCase("remove")) {
					books.remove(index);
					quantities.remove(index);
					System.out.println(book + " has been removed from your order.");
				} else {
					int newQty = Integer.parseInt(action);
					quantities.set(index, newQty);
					System.out.println(book + " quantity updated to " + newQty);
				}
			} else {
				System.out.println(book + " not found in your orders.");
			}
		}

		System.out.println("\nFinal Order Summary:");
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
			System.out.println("Quantity " + quantities.get(i) + ",");
		}

		System.out.println("Thank you for shopping with us!");
		sc.close();
	}
}
