package my.collection;

import java.util.ArrayList;
import java.util.List;

// Removing elements in an ArrayList
	// 1. public boolean remove(Object); // Take Object gives true or false
	// 2. public Object remove(int); // Takes index number gives deleted Object
public class Ex09 {
	public static void main(String[] args) {
		List<String> months = new ArrayList<>();
		months.add("Jan");
		months.add("Feb");
		months.add("March");
		months.add("April");
		System.out.println("Before deletion: "+months);
		
		// public boolean remove(Object);
		System.out.println("Is march removed? "+months.remove("March")); // True
		System.out.println("After deletion: "+months);

		// Before executing this line comment out the just previous line
		// public Object remove(int);
		System.out.println("Is march removed? "+months.remove(2)); // March
		System.out.println("After deletion: "+months);

	}
}
