package my.arrays.practice;

import java.util.*;

// 1. Print all elements of an array.
public class Ex00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();
		if (size > 0) {
			byte[] arr = new byte[size];
			for (byte b = 0; b < size; b++) {
				System.out.println("Enter element " + (b + 1) + ": ");
				arr[b] = sc.nextByte();

			}

			System.out.println("Array elements are: ");

			for (byte num : arr) {
				System.out.print(num + " ");
			}
		} else {
			System.err.println("Size should be greater than 0");
		}
		sc.close();
	}
}
