package my08.collection.set.practice;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
        Set<String> languages = new HashSet<>();

        if (languages.isEmpty()) {
            System.out.println("The set is currently empty.");
        } else {
            System.out.println("The set is not empty.");
        }

        languages.add("Java");

        if (languages.isEmpty()) {
            System.out.println("The set is currently empty.");
        } else {
            System.out.println("The set is not empty. Elements: " + languages);
        }
    }
}
