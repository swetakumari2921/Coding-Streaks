package my.arrays.practice;

import java.util.Scanner;

public class Ex181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int start = -1, end = -1;

		// Find first element out of order from left
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				start = i;
				break;
			}
		}

		if (start == -1) {
			System.out.println("Array is already sorted");
			return;
		}

		// Find first element out of order from right
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] < arr[i - 1]) {
				end = i;
				break;
			}
		}

		int min = arr[start];
		int max = arr[start];

		for (int i = start; i <= end; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		while (start > 0 && arr[start - 1] > min)
			start--;

		while (end < n - 1 && arr[end + 1] < max)
			end++;

		System.out.println("Minimum subarray to sort:");
		System.out.println("Start Index = " + start);
		System.out.println("End Index = " + end);
	}
}
