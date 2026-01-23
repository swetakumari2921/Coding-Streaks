package my.arrays.practice;

// Find first non-repeating element.

import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean found = false;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First non-repeating element is: " + arr[i]);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No non-repeating element found.");
		}

		sc.close();
	}
}
