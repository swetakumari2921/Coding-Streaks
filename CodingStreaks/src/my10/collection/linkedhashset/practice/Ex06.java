package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex06 {
	public static void main(String[] args) {
        // 1. Declare and initialize a LinkedHashSet
        LinkedHashSet<String> colors = new LinkedHashSet<>();

        // 2. Add elements (maintains insertion order)
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate: ignored

        // 3. Get the size
        int size = colors.size();

        // 4. Display result
        System.out.println("LinkedHashSet elements: " + colors);
        System.out.println("Size of LinkedHashSet: " + size);
    }
}
