package my08.collection.set.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex20 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        int sum = 0;

        for (int n : set) {
            sum = sum + n;
        }

        double average = (double) sum / set.size();

        System.out.println("Set: " + set);
        System.out.println("Average: " + average);
    }
}
