package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex77 {
	public static ArrayList<Integer> slidingWindowMax(int[] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		int n = arr.length;

		for (int i = 0; i <= n - k; i++) {
			int max = arr[i];
			for (int j = i + 1; j < i + k; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			result.add(max);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter window size K:");
		int k = sc.nextInt();

		ArrayList<Integer> maxList = slidingWindowMax(arr, k);
		System.out.println("Sliding window maximums: " + maxList);

		sc.close();
	}
}
