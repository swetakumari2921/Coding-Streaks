package my.arrays.practice;

// 21. Merge two arrays.

import java.util.*;

public class Ex20 {
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

		//merged logic
		int[] merged = new int[array1 + array2];
		for (int i = 0; i < array1; i++) {
			merged[i] = arr[i];
		}

		for (int i = 0; i < array2; i++) {
			merged[array1 + i] = brr[i];
		}
		System.out.println("\nMerged Array: ");
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + " ");
		}
		sc.close();
	}
}
