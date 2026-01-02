package my.arrays.practice;

import java.util.*;

// 9. Sort an array in ascending order.

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();
		
		if (size > 0) {
			
			byte[] arr = new byte[size];
			for (byte b = 0; b < size; b++) {
				System.out.println("Enter elememnt: "+(b+1)+": ");
				arr[b] = sc.nextByte();
			}

			for (byte b = 0; b < size - 1; b++) {
				if (arr[b] < arr[b + 1]) {
					System.out.println("Not Sorted");
					sc.close();
					return;
				}
			}
			System.out.println("sorted");
		} else {
			System.err.println("Size should be greater than 0");
		}
		sc.close();
	}
}
