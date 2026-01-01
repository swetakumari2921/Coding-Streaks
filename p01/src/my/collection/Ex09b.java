package my.collection;

import java.util.ArrayList;
import java.util.List;

//Removing elements in an ArrayList
// 1. public boolean remove(Object); // Take Object gives true or false
// 2. public Object remove(int); // Takes index number gives deleted Object

public class Ex09b {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(30);
		num.add(45);
		num.add(55);
		num.add(23);
		num.add(12);

		System.out.println("Before deletion: " + num);

		// public Object remove(int);
//		System.out.println("Is 45 removed? "+ num.remove(2));

		// Before executing this line comment out the just previous line
		// public boolean remove(Object);
		Integer obj = new Integer(55);
		System.out.println("Is 55 removed? " + num.remove(obj));
		System.out.println("After deletion: "+num);
	}
}
