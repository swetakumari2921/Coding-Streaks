package my09.collection.hashset.practice;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        if (numbers.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }

        numbers.add(100);

        if (numbers.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty: " + numbers);
        }
    }
}
