package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex66 {

	public static ArrayList<Integer> findSubarray(int[] arr, int target) {

		ArrayList<Integer> result = new ArrayList<>();

		int sum = 0;
		int start = 0;

		for (int end = 0; end < arr.length; end++) {

			sum += arr[end];

			while (sum > target && start <= end) {
				sum -= arr[start];
				start++;
			}

			if (sum == target) {
				result.add(start);
				result.add(end);
				return result;
			}
		}

		return result; // empty if not found
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements (only positive numbers):");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter target sum:");
		int target = sc.nextInt();

		ArrayList<Integer> ans = findSubarray(arr, target);

		if (ans.size() == 0) {
			System.out.println("No subarray found");
		} else {
			System.out.println("Subarray found from index " + ans.get(0) + " to " + ans.get(1));
		}
	}
}
