package my.arrays.practice;

import java.util.Scanner;

// 23. Find the union of two arrays.

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1: ");
        int array1 = sc.nextInt();
        if (array1 <= 0) {
            System.err.println("Size should be greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[array1];
        for (int i = 0; i < array1; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array 1: ");
        for (int i = 0; i < array1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter size of array 2: ");
        int array2 = sc.nextInt();
        if (array2 <= 0) {
            System.err.println("Size should be greater than 0");
            sc.close();
            return;
        }

        int[] brr = new int[array2];
        for (int i = 0; i < array2; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            brr[i] = sc.nextInt();
        }

        System.out.println("Array 2: ");
        for (int i = 0; i < array2; i++) {
            System.out.print(brr[i] + " ");
        }

        // union logic
        int[] union = new int[array1 + array2];
        int k = 0;

        // Add all elements from first array
        for (int i = 0; i < array1; i++) {
            union[k++] = arr[i];
        }

        // Add elements from second array if not already present in first array
        for (int i = 0; i < array2; i++) {
            boolean present = false;
            for (int j = 0; j < array1; j++) {
                if (brr[i] == arr[j]) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                union[k++] = brr[i];  
            }
        }

        System.out.println("\nUnion of two arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}
