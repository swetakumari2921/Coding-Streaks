package my.arrays.practice;

import java.util.Scanner;

public class Ex97 {
	public static int atMostK(int[] arr, int k) {
		int left = 0, count = 0, odd = 0;

		for (int right = 0; right < arr.length; right++) {

			if (arr[right] % 2 != 0) {
				odd++;
			}

			while (odd > k) {
				if (arr[left] % 2 != 0) {
					odd--;
				}
				left++;
			}

			count += (right - left + 1);
		}

		return count;
	}

	public static int countExactlyK(int[] arr, int k) {
		return atMostK(arr, k) - atMostK(arr, k - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter value of K (number of odd numbers): ");
		int k = sc.nextInt();

		int result = countExactlyK(arr, k);

		System.out.println("Number of subarrays with exactly " + k + " odd numbers: " + result);
	}
}