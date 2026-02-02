package my.arrays.practice;

import java.util.*;

public class Ex49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();

		int count = countSubarraysLessThanK(arr, k);
		System.out.println("Number of subarrays with sum less than " + k + ": " + count);

		sc.close();
	}

	private static int countSubarraysLessThanK(int[] arr, int k) {
		int count = 0;

		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
				sum += arr[end];
				if (sum < k) {
					count++;
				} else {
					break;
				}
			}
		}

		return count;
	}
}
