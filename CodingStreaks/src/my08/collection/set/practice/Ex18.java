package my08.collection.set.practice;

import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Odd numbers:");

        for (int n : set) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}
