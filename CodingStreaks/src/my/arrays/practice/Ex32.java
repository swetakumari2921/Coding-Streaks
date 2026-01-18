package my.arrays.practice;

import java.util.Scanner;

// Find the leader elements in an array (element greater than all right elements).

public class Ex32 {
	public static void findLeaders(int[] arr) {

		int n = arr.length;
		int maxFromRight = arr[n - 1];

		System.out.print("Leader elements: ");
		System.out.print(maxFromRight + " ");

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > maxFromRight) {
				maxFromRight = arr[i];
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		findLeaders(arr);
	}
}
