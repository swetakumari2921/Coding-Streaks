package my09.collection.hashset.practice;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
        // 1. Declare and initialize a HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // 2. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate: ignored

        // 3. Get the size
        int size = numbers.size();

        // 4. Display result
        System.out.println("HashSet elements: " + numbers);
        System.out.println("Size of HashSet: " + size);
    }
}
