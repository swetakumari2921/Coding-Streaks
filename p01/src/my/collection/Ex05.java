package my.collection;

import java.util.ArrayList;
import java.util.List;

// Retrieving length of ArrayList
	// 1. public int size();
public class Ex05 {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<>();
		// 1. public int size();
		System.out.println("Number of element: "+sports.size()); // 0
		sports.add("Cricket");
		sports.add("Football");
		sports.add("Badminton");
		System.out.println("After adding 3 elements size is: "+sports.size()); // 3
		
		System.out.println(sports); // [Cricket, Football, Badminton]
	}
}
