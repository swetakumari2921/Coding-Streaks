package my08.collection.set.practice;

import java.util.*;

public class Ex21 {
	public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(25);
        set.add(10);
        set.add(45);
        set.add(30);
        set.add(15);

        int max = Integer.MIN_VALUE;

        for (int n : set) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Set: " + set);
        System.out.println("Maximum element: " + max);
    }
}
