package my.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Searching an element in ArrayList
// 1. public boolean contains(Object); // If true: true, If false: false
// 2. public int indexOf(Object); // If the object is present: index number 
								 // If the object is not present: -1

public class Ex08b {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(45);
		num.add(78);
		Scanner sc = new Scanner(System.in);
		System.out.println(num);
		System.out.println("Enter a number to be searched: ");
		int n = sc.nextInt();
		boolean found = num.contains(n); // public boolean contains(Object);
		if (found == false) {
			System.out.println("Given number is not present!");
			return;
		} else {
			System.out.println(n + " is present at index: " + num.indexOf(n)); // public int indexOf(Object);
		}
	}
}
