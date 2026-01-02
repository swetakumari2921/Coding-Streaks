package my.collection;

import java.util.*;

public class Ex35 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		System.out.println(productData.put("Laptop", 35000l));
		System.out.println(productData.put("Mobile", 15000l));
		System.out.println(productData.put("Laptop", 28000l));
		
//		Output:
//		null
//		null
//		35000
		
//		HashMap is an unordered collection and maintain unique keys, That's why we cannot predict the order of output.
		System.out.println(productData); //{Laptop=28000, Mobile=15000}
		
//		If i write laptop instead of Laptop then again we will be get nulls only because for map laptop is unique Laptop is not unique
//		Ex: refer next one
	}
}
