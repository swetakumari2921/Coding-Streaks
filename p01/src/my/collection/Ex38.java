package my.collection;

import java.util.*;

public class Ex38 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();

		productData.put("Laptop", 35000l);
		productData.put("Backpack", 5000l);
		productData.put("Mobile", 15000l);
		productData.put("Watch", 65000l);

		System.out.println("Total products are: " + productData.size());
		System.out.println("\n" + productData);

		// To remove object from Map we use remove() method it take Object as argument
		// then search this object is present in Map or not if it is present then delete
		// that object and return the previous value associated with the specific
		// key/object that's why for Laptop and Mobile we are getting it's price and the
		// object/key which is not present in Map for them it returns null
		
		System.out.println("\nPrice of Laptop: " + productData.remove("Laptop"));
		System.out.println("Price of Mobile: " + productData.remove("Mobile"));
		System.out.println("Price of keyboard: " + productData.remove("Keyboard"));

		System.out.println("\nNow, Total products are: " + productData.size());
		System.out.println(productData);
	}
}
