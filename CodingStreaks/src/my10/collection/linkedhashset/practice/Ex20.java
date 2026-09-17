package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        int sum = 0;

        for (int n : set) {
            sum = sum + n;
        }

        System.out.println("LinkedHashSet: " + set);
        System.out.println("Sum: " + sum);
    }
}
