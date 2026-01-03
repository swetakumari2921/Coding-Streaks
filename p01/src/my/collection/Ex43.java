package my.collection;

import java.util.*;

public class Ex43 {
	public static void main(String[] args) {
		Map<String, Long> productData = new TreeMap<>();
		System.out.println(productData.put("Laptop", 35000l));
		System.out.println(productData.put("Mobile", 15000l));
		System.out.println(productData.put("Camera", 28000l));
		System.out.println(productData);
		
//		Output:
//		null
//		null
//		null
//		{Camera=28000, Laptop=35000, Mobile=15000}
		
		// reason of null is same as previous HashMap


	}
}
