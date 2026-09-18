package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex21 {
	public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

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

        System.out.println("LinkedHashSet: " + set);
        System.out.println("Maximum element: " + max);
    }
}
