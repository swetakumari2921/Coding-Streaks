package my.arrays.practice;

import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int cand1 = 0, cand2 = 0, count1 = 0, count2 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == cand1) {
				count1++;
			} else if (a[i] == cand2) {
				count2++;
			} else if (count1 == 0) {
				cand1 = a[i];
				count1 = 1;
			} else if (count2 == 0) {
				cand2 = a[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == cand1)
				count1++;
			if (a[i] == cand2)
				count2++;
		}

		boolean found = false;

		if (count1 > n / 3) {
			System.out.println("Majority element: " + cand1);
			found = true;
		}

		if (cand2 != cand1 && count2 > n / 3) {
			System.out.println("Majority element: " + cand2);
			found = true;
		}

		if (!found) {
			System.out.println("No Majority Element");
		}
	}
}
