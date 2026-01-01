package my.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Searching an element in ArrayList
// 1. public boolean contains(Object); // If true: true, If false: false
// 2. public int indexOf(Object); // If the object is present: index number 
								 // If the object is not present: -1

public class Ex08 {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<>();
		sports.add("ABC");
		sports.add("XYZ");
		sports.add("PQR");
		System.out.println(sports);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sports name to be searched: ");
		String str = sc.nextLine();		
		boolean found = sports.contains(str); // public boolean contains(Object);
		if (found == false) {
			System.out.println("Given sport is not present!");
			return;
		} else {
			System.out.println(str + " is present at index: " + sports.indexOf(str)); // public int indexOf(Object);
		}
	}
}
