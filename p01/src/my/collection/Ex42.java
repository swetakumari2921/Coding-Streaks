package my.collection;

import java.util.*;

//Traversing map: only on key-value

//public Set entrySet();

//Traversing a Map using entrySet() with Iterator and Generics
//Accessing both key and value separately for cleaner and type-safe code
//This is the recommended approach in real projects and interviews

//Output will be in the format: "Item name: <key>, item price: <value>"

public class Ex42 {
	public static void main(String[] args) {
		
		Map<String, Long> productData = new HashMap<>();

		productData.put("Laptop", 35000l);
		productData.put("Backpack", 5000L);
		productData.put("Mobile", 25000L);
		productData.put("Watch", 65000L);

		Set<Map.Entry<String, Long>> items = productData.entrySet();

		System.out.println("Item in your cart: ");
		
		Iterator<Map.Entry<String, Long>> it = items.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Long> e = it.next();
			String name = e.getKey();
			long price = e.getValue();
			System.out.println("Item name: " + name + ", item price: " + price);
		}
//		Output
//		Item in your cart: 
//			Item name: Laptop, item price: 35000
//			Item name: Backpack, item price: 5000
//			Item name: Watch, item price: 65000
//			Item name: Mobile, item price: 25000
	}
}
