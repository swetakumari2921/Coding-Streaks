package my08.collection.set.practice;

import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
        // 1. Create a Set
        Set<String> fruits = new HashSet<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element, will not be added

        // 3. Find the size
        int totalSize = fruits.size();

        // 4. Output the result
        System.out.println("Elements in Set: " + fruits);
        System.out.println("Size of the Set: " + totalSize);
    }
}
