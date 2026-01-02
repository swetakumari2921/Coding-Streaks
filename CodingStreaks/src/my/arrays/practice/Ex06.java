package my.arrays.practice;

import java.util.*;

// 7. Reverse an array.

public class Ex06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();

		if (size > 0) {

			byte arr[] = new byte[size];

			for (byte b = 0; b < size; b++) {
				System.out.println("Enter element " + (b + 1) + ": ");
				arr[b] = sc.nextByte();
			}

			byte start = 0;
			byte end = (byte) (size - 1);

			while (start < end) {
				byte temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;

				start++;
				end--;
			}
			System.out.println("Reversed array: " + Arrays.toString(arr));
		} else {
			System.err.println("Size should be greater than 0");
		}
		sc.close();
	}
}
