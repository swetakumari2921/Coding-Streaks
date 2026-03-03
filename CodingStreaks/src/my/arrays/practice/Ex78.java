package my.arrays.practice;

import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] pos = new int[n];
		int[] neg = new int[n];

		int p = 0, ng = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				pos[p++] = arr[i];
			} else {
				neg[ng++] = arr[i];
			}
		}

		int i = 0, j = 0, k = 0;

		while (i < p && j < ng) {
			arr[k++] = pos[i++];
			arr[k++] = neg[j++];
		}

		while (i < p) {
			arr[k++] = pos[i++];
		}

		while (j < ng) {
			arr[k++] = neg[j++];
		}

		System.out.println("Rearranged array:");
		for (int x = 0; x < n; x++) {
			System.out.print(arr[x] + " ");
		}
	}
}
