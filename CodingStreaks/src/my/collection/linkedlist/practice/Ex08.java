package my.collection.linkedlist.practice;

import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Input number of items
		System.out.print("Enter number of grocery items: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		// Constraints check
		if (n < 1 || n > 100) {
			System.out.println("Number of items must be between 1 and 100.");
			sc.close();
			return;
		}

		// Step 2: Create LinkedList
		LinkedList<String> itemNames = new LinkedList<>();
		LinkedList<Integer> itemPrices = new LinkedList<>();

		// Step 3: Input items and prices
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of item " + (i + 1) + ": ");
			String name = sc.nextLine();

			// Validate item name length and characters
			if (name.length() < 1 || name.length() > 30 || !name.matches("[a-zA-Z]+")) {
				System.out.println("Invalid item name! Must be 1-30 alphabetic characters.");
				i--; // repeat this iteration
				continue;
			}

			System.out.print("Enter price of " + name + ": ₹");
			int price = sc.nextInt();
			sc.nextLine(); // consume newline

			// Validate price
			if (price < 1 || price > 1000) {
				System.out.println("Invalid price! Must be between 1 and 1000.");
				i--; // repeat this iteration
				continue;
			}

			// Add to LinkedList
			itemNames.add(name);
			itemPrices.add(price);
		}

		// Step 4: Print the list of items with prices
		System.out.println("\nGrocery Items and Prices:");
		for (int i = 0; i < itemNames.size(); i++) {
			System.out.println(itemNames.get(i) + " - ₹" + itemPrices.get(i));
		}

		sc.close();
	}
}
