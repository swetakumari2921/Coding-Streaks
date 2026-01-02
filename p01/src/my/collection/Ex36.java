package my.collection;

import java.util.*;

public class Ex36 {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		System.out.println(productData.put("Laptop", 35000l));
		System.out.println(productData.put("Mobile", 15000l));
		System.out.println(productData.put("laptop", 28000l));

//		Output:
//		null
//		null
//		null

//		HashMap is an unordered collection and maintain unique keys, That's why we cannot predict the order of output.
		System.out.println(productData); // {Laptop=35000, laptop=28000, Mobile=15000}
	}
}
