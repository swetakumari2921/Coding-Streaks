package my.arrays.practice;

import java.util.*;

// 8. Check if an array is sorted (ascending order).

public class Ex07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();

		if (size > 0) {

			int arr[] = new int[size];

			for (int b = 0; b < size; b++) {
				System.out.println("Enter element " + (b + 1) + ": ");
				arr[b] = sc.nextInt();
			}

			for (int b = 0; b < size - 1; b++) {
				if (arr[b] > arr[b + 1]) {
					System.out.println("Not sorted");
					sc.close();
					return;
				}
			}
			System.out.println("Sorted");

		} else {
			System.err.println("Size should be greater than 0");
		}
		sc.close();
	}
}
