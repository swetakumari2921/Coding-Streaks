package my.collection.arraylist.practice;

import java.util.*;

class Product2 {
	String name;
	int stock;

	Product2(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
}

public class Ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product2> catalog = new ArrayList<>();

		System.out.print("Enter the number of initial products: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter product name and stock count:");
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String name = parts[0];
			int stock = Integer.parseInt(parts[1]);
			catalog.add(new Product2(name, stock));
			System.out.println("Added product: " + name + " with stock " + stock);
		}

		System.out.print("\nEnter the number of operations: ");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.print("Enter operation: ");
			String opLine = sc.nextLine();
			String[] parts = opLine.split(" ");
			String operation = parts[0].toLowerCase();

			switch (operation) {
			case "add":
				if (parts.length < 3) {
					System.out.println("Invalid add operation. Usage: add <productName> <stockCount>");
					break;
				}
				String addName = parts[1];
				int addStock = Integer.parseInt(parts[2]);
				catalog.add(new Product2(addName, addStock));
				System.out.println("Product added: " + addName + " with stock " + addStock);
				break;

			case "remove":
				if (parts.length < 2) {
					System.out.println("Invalid remove operation. Usage: remove <productName>");
					break;
				}
				String removeName = parts[1];
				boolean removed = catalog.removeIf(p -> p.name.equalsIgnoreCase(removeName));
				if (removed) {
					System.out.println("Product removed: " + removeName);
				} else {
					System.out.println("Product not found: " + removeName);
				}
				break;

			case "update":
				if (parts.length < 3) {
					System.out.println("Invalid update operation. Usage: update <productName> <newStock>");
					break;
				}
				String updateName = parts[1];
				int newStock = Integer.parseInt(parts[2]);
				boolean updated = false;
				for (Product2 p : catalog) {
					if (p.name.equalsIgnoreCase(updateName)) {
						p.stock = newStock;
						updated = true;
						System.out.println("Updated stock for " + updateName + " to " + newStock);
						break;
					}
				}
				if (!updated) {
					System.out.println("Product not found: " + updateName);
				}
				break;

			default:
				System.out.println("Invalid operation. Available: add, remove, update");
			}
		}

		catalog.sort(Comparator.comparing(p -> p.name.toLowerCase()));

		System.out.println("\nFinal Product Catalog (Sorted Alphabetically):");
		for (Product2 p : catalog) {
			System.out.println(p.name + " " + p.stock);
		}

		sc.close();
	}
}
