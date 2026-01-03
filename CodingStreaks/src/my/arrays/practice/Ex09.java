 package my.arrays.practice;

import java.util.*;

// 10. Sort an array in ascending order.

public class Ex09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();

		if (size <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		byte[] arr = new byte[size];

		for (byte b = 0; b < size; b++) {
			System.out.println("Enter element " + (b + 1) + ": ");
			arr[b] = sc.nextByte();
		}
		
		// Your array
		System.out.println("Your array:");
		for(byte b = 0; b<size; b++) {
			System.out.print(arr[b]+" ");
		}
		
		System.out.println();

		// Bubble sort logic
		for (byte b = 0; b < size - 1; b++) {
			for (byte c = 0; c < size - b - 1; c++) {
				if (arr[c] > arr[c + 1]) {
					byte temp = arr[c];
					arr[c] = arr[c + 1];
					arr[c + 1] = temp;
				}
			}
		}
		

		// Print sorted array
		System.out.println("Sorted array in ascending order: ");
		for (byte b = 0; b < size; b++) {
			System.out.print(arr[b] + " ");
		}
		sc.close();
	}
}
