package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex150 {

	// Function to create deep copy manually
	public static ArrayList<String> deepCopy(ArrayList<String> original) {

		ArrayList<String> copy = new ArrayList<>();

		for (int i = 0; i < original.size(); i++) {

			// Creating new String object
			copy.add(new String(original.get(i)));
		}

		return copy;
	}

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");

		ArrayList<String> list2 = deepCopy(list1);

		System.out.println("Original List: " + list1);
		System.out.println("Copied List: " + list2);
	}
}
