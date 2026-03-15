package my.collection.arraylist.practice;

import java.util.Scanner;

public class Ex75 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter k:");
		int k = sc.nextInt();

		int kthLargest = findKthLargest(arr, n, k);
		System.out.println(k + "th largest element is: " + kthLargest);
	}

	public static int findKthLargest(int[] arr, int n, int k) {

		int largest = Integer.MIN_VALUE;
		int secondLargest;
		int count = 0;

		int[] temp = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = arr[i];

		while (k > 0) {
			largest = Integer.MIN_VALUE;
			int index = -1;

			for (int i = 0; i < n; i++) {
				if (temp[i] > largest) {
					largest = temp[i];
					index = i;
				}
			}

			temp[index] = Integer.MIN_VALUE; 
			k--;
		}

		return largest;
	}
}
