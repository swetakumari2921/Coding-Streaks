package my.arrays.practice;

import java.util.*;

// 6. Count the number of even and odd numbers in an array.

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		byte size = sc.nextByte();
		byte even = 0;
		byte odd = 0;
		if(size>0) {
			byte [] arr = new byte[size];
			for(byte b = 0; b<size; b++) {
				System.out.println("Enter element "+(b+1)+": ");
				arr[b] = sc.nextByte();
				if(arr[b]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			System.out.println("Even: "+even);
			System.out.println("Odd: "+odd);
		}else {
			System.err.println("Size should be positive.");
		}
		sc.close();
	}
}
