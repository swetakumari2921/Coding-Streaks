package my.collection;

import java.util.*;

public class Ex37 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		productData.put("Laptop", 35000l);
		productData.put("Backpack", 5000l);
		productData.put("Mobile", 25000l);
		productData.put("Watch", 65000l);

		// for finding how many objects are present in Map we use size() method
		System.out.println("Total products are: " + productData.size());

		// for getting the object which is present in Map we use get() method
		System.out.println("\nPrice of Laptop: " + productData.get("Laptop"));
		System.out.println("Price of Backpack: " + productData.get("Backpack"));
		System.out.println("Price of Mobile: " + productData.get("Mobile"));
		System.out.println("Price of Keyboard: " + productData.get("Keyboard")); // The object which is not present in Map we get null for them that's why fror keyboard we are getting null because in my Map the keyboard is not present. 
		System.out.println("Price of Watch: " + productData.get("Watch"));

		System.out.println("\nNow total products are: " + productData.size());
	}
}
