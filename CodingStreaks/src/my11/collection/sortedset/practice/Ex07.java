package my11.collection.sortedset.practice;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
        SortedSet<Integer> scores = new TreeSet<>();

        if (scores.isEmpty()) {
            System.out.println("SortedSet is empty.");
        } else {
            System.out.println("SortedSet is not empty.");
        }

        scores.add(85);

        if (scores.isEmpty()) {
            System.out.println("SortedSet is empty.");
        } else {
            System.out.println("SortedSet is not empty: " + scores);
        }
    }
}
