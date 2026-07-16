package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex208 {

	public static int maxSubarraySum(ArrayList<Integer> arr, int k) {
		int n = arr.size();

		if (k > n) {
			System.out.println("Invalid value of K");
			return -1;
		}

		int windowSum = 0;

		// Sum of first K elements
		for (int i = 0; i < k; i++) {
			windowSum += arr.get(i);
		}

		int maxSum = windowSum;

		// Sliding window
		for (int i = k; i < n; i++) {
			windowSum = windowSum - arr.get(i - k) + arr.get(i);
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.print("Enter K: ");
		int k = sc.nextInt();

		int result = maxSubarraySum(arr, k);
		if (result != -1) {
			System.out.println("Maximum subarray sum with exactly " + k + " elements: " + result);
		}

		sc.close();
	}
}
