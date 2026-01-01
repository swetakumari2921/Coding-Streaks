package my.arrays.practice;

import java.util.*;

// 3. Find the average of array elements.
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();
		byte[] brr = new byte[size];
		int sum = 0;
		byte count = 0;
		if (size > 0) {
			for (byte b = 0; b < size; b++) {
				System.out.println("Enter element " + (b + 1) + ": ");
				brr[b] = sc.nextByte();
				sum = sum + brr[b];
				count++;
			}
			System.out.println("Sum: " + sum);
			System.out.println("Average: " + sum / count);
		} else {
			System.err.println("Size should be in positive number!");
		}
		sc.close();
	}
}
