package my.arrays.practice;

// Count inversions in an array.

import java.util.Scanner;

public class Ex31 {
	public int countInversions(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----- Inversion Count Program -----");
		System.out.println("An inversion is a pair (i, j) such that i < j and arr[i] > arr[j].");
		System.out.println();

		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Ex31 obj = new Ex31();
		int result = obj.countInversions(arr);

		System.out.println();
		System.out.println("Total number of inversions: " + result);

		sc.close();
	}
}
