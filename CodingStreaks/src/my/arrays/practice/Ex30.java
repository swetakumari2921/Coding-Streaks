package my.arrays.practice;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean isPalindrome = true;

		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - 1 - i]) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Array is a Palindrome");
		} else {
			System.out.println("Array is NOT a Palindrome");
		}

		sc.close();
	}
}
