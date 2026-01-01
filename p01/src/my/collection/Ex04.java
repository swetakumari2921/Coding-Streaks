package my.collection;

import java.util.ArrayList;
import java.util.List;

// Retriving Data from arraylist
	// 1. public Object get(int) //take index & give Object which is present on the particular index
	
public class Ex04 {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<>();
		sports.add("Criket");
		sports.add("Football");
		sports.add("Badminton");
		
		// public Object get(int)
		System.out.println(sports.get(0)); // Criket 
		System.out.println(sports.get(1)); // Football
		System.out.println(sports.get(2)); // Badminton
		System.out.println(sports.get(3)); // java.lang.IndexOutOfBoundsException
	}
}
