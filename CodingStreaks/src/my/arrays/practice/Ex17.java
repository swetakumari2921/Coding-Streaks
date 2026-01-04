package my.arrays.practice;

import java.util.Scanner;

// 18. Find the frequency of each element.

public class Ex17 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.err.println("Size should be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Array to keep track of visited elements
        boolean[] visited = new boolean[size];

        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue; // skip if already counted
            }

            int count = 1; // count current element
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate as visited
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " time" + (count > 1 ? "s" : ""));
        }

        sc.close();
    }
}