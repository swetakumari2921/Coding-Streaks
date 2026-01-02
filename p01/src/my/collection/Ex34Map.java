package my.collection;

import java.util.HashMap;
import java.util.Map;

public class Ex34Map {
	public static void main(String[] args) {
		Map<String, Long> productData = new HashMap<>();
		System.out.println(productData.put("Laptop: ", 35000l));
		System.out.println(productData.put("Mobile", 15000l));
		System.out.println(productData.put("Speaker", 45000l));

		// Output:
		// null
		// null
		// null

//		HashMap is an unordered collection and maintain unique keys, That's why we cannot predict the order of output.
		System.out.println(productData); // {Laptop: =35000, Mobile=15000, Speaker=45000}
		
//		Why null?
//		Ans: Because the put method is take argument and add in map, 
//		if entry/argument is new then it return previous values means 
//		if there is not any value mean null is there 
//		that's why all are returning null because each and every data is unique or added first time

//		another scenario, If we again added Laptop then the first laptop value will be overriden by new laptop value 
//		and in this case the put will return previous value which is 35000
		
//		Note: For string is case sensitive means Laptop and laptop both are d/f
		
//		Ex: refer next one
		
	}
}
