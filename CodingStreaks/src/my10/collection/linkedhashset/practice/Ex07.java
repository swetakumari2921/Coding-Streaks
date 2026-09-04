package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex07 {
	public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        if (cities.isEmpty()) {
            System.out.println("LinkedHashSet is empty.");
        } else {
            System.out.println("LinkedHashSet is not empty.");
        }

        cities.add("Patna");

        if (cities.isEmpty()) {
            System.out.println("LinkedHashSet is empty.");
        } else {
            System.out.println("LinkedHashSet is not empty: " + cities);
        }
    }
}
