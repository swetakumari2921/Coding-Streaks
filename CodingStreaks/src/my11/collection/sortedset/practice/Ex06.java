package my11.collection.sortedset.practice;

import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
        // 1. Declare a SortedSet using TreeSet implementation
        SortedSet<Integer> sortedNumbers = new TreeSet<>();

        // 2. Add elements (automatically sorted in natural ascending order)
        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(30);
        sortedNumbers.add(10); // Duplicate: ignored

        // 3. Find the size
        int size = sortedNumbers.size();

        // 4. Output the result
        System.out.println("SortedSet elements: " + sortedNumbers);
        System.out.println("Size of SortedSet: " + size);
    }
}
