package my.arrays.practice;

import java.util.*;

// 11. Sort an array in descending order.

public class Ex10 {
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

		// Your array
		System.out.println("Your array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

//		bubble sort
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		// Print sorted array
		System.out.println("Sorted array in ascending order: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
