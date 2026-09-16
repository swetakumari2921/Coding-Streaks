package my11.collection.sortedset.practice;

import java.util.*;

public class Ex19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SortedSet<Integer> set = new TreeSet<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        int sum = 0;

        for (int n : set) {
            sum = sum + n;
        }

        System.out.println("Sum = " + sum);
    }
}
