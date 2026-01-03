package my.arrays.practice;

import java.util.*;

// 14. Swap two elements in an array.

public class Ex13 {
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

		System.out.println("Before Swapping: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

//		logic
		System.out.println("\n\nEnter index of first element to swap: ");
		int first = sc.nextInt();
		if(first>arr.length) {
			System.err.println("Index not found");
			sc.close();
			return;
		}

		System.out.println("Enter index of second element to swap: ");
		int second = sc.nextInt();
		if(second>arr.length) {
			System.err.println("Index not found");
			sc.close();
			return;
		}
		
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
		System.out.println("After Swapping: ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}

	}
}
