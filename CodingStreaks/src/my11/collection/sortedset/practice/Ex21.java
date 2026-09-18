package my11.collection.sortedset.practice;

import java.util.*;

public class Ex21 {
	public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(25);
        set.add(10);
        set.add(45);
        set.add(30);
        set.add(15);

        System.out.println("SortedSet: " + set);
        System.out.println("Minimum element: " + set.first());
    }
}
