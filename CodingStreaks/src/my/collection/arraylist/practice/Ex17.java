package my.collection.arraylist.practice;

import java.util.ArrayList;

class Product {
	String name;
	int quantity;
	int price;

	Product(String name, int quantity, int price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
}

public class Ex17 {

	public static void main(String[] args) {

		ArrayList<Product> inventory = new ArrayList<>();

		// Step 1: Add products
		inventory.add(new Product("Apples", 10, 50));
		inventory.add(new Product("Milk", 5, 40));
		inventory.add(new Product("Bread", 3, 30));

		// Step 2: Sales
		sellProduct(inventory, "Apples", 3);
		sellProduct(inventory, "Bread", 5);

		// Step 3: Remove out-of-stock products
		inventory.removeIf(product -> product.quantity == 0);

		// Step 4: Display final inventory
		System.out.println("Final Inventory:");
		inventory.forEach(
				product -> System.out.println(product.name + " (" + product.quantity + " left) ₹" + product.price));
	}

	private static void sellProduct(ArrayList<Product> inventory, String name, int soldQty) {
		for (Product product : inventory) {
			if (product.name.equals(name)) {
				product.quantity = product.quantity - soldQty;
				if (product.quantity < 0) {
					product.quantity = 0;
				}
				break;
			}
		}
	}
}
