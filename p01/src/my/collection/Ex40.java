package my.collection;

import java.util.*;

// Traversing map: only on values
// public Collection values();
public class Ex40 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		productData.put("Laptop", 35000L);
		productData.put("Backpack", 5000L);
		productData.put("Mobile", 25000L);
		productData.put("Watch", 65000L);

		Collection<Long> itemPrice = productData.values();
		
		System.out.println("Price of items in your cart are: ");
		long sum = 0;
		
		for(Long price : itemPrice) {
			sum=sum+price;
		}
		System.out.println("Total bill amount: "+sum);
	}
}
