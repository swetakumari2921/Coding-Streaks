package my.collection;

import java.util.*;

// Traversing map: only on key-value

// public Set entrySet();

//Traversing a Map using entrySet() with Iterator
//This prints each Map.Entry object directly (raw type, not type-safe)
//Output will be in the format key=value

//Note: Using raw Map.Entry is not recommended in professional code

public class Ex41 {
	public static void main(String[] args) {
		
		Map<String, Long> productData = new HashMap<>();
		
		productData.put("Laptopn", 35000L);
		productData.put("Backpack", 5000L);
		productData.put("Mobile", 25000L);
		productData.put("Watch", 65000L);
		
		Set<Map.Entry<String, Long>> items = productData.entrySet();
		
		System.out.println("Item in your cart are: ");
		
		Iterator<Map.Entry<String, Long>> it = items.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = it.next();
			System.out.println(e);
		}
		
//		Output:
//		Item in your cart are: 
//			Backpack=5000
//			Laptopn=35000
//			Watch=65000
//			Mobile=25000
	}
}

// Summary
// Traversing a Map
//Set<String> itemNames = productData.keySet(); // Only on keys
//Collection<Long> itemPrice = productData.values(); // Only on values
//Set<Map.Entry<String, Long>> items = productData.entrySet(); // On key-values

