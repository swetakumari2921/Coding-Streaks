package my.arrays.practice;

import java.util.*;

// 15. Rotate an array by one position (left & right).

public class Ex14 {
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

		System.out.println("Original array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// left rotation logic
//		for(int i = 0; i<size-1; i++) {
//			int temp = arr[i];
//			arr[i] = arr[i+1];
//			arr[i+1] = temp;
//		}

//		=================================================================================================
		// CHATGPT LOGIC STARTS
		int first = arr[0];            // save the first element
		for(int i = 0; i < size-1; i++) {
		    arr[i] = arr[i+1];         // shift all elements left by 1
		}
		arr[size-1] = first;           // put the first element at the end
		// CHATGPT LOGIC ENDS
//		=================================================================================================

		System.out.println("\nRotate Left by 1: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// Right rotation logic
//		for(int i = size-1; i>=0; i--) {
//			int temp = arr[size-1];
//			arr[size-1] = arr[0];
//			arr[0] = temp;
//		}
		
//		=================================================================================================
		// CHATGPT LOGIC STARTS
		int last = arr[size-1];         // store the last element
		for(int i = size-1; i > 0; i--) {
		    arr[i] = arr[i-1];          // shift all elements right by 1
		}
		arr[0] = last;                  // put last element at the first position
		// CHATGPT LOGIC ENDS
//		=================================================================================================

		
		System.out.println("\nRotate Right by 1: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
	}
}


















