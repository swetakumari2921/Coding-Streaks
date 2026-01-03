package my.collection;

import java.util.*;

// Traversing map: only on keys
// public Set keySet();

public class Ex39 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		productData.put("Laptop", 35000L);
		productData.put("Backpack", 5000L);
		productData.put("Mobile", 25000L);
		productData.put("Watch", 65000L);

		Set<String> itemNames = productData.keySet();
		
		System.out.println("Items in your cart are: ");
		for (String product : itemNames) {
			System.out.println(product);
		}

	}
}
