package my.arrays.practice;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int firstRepeating = -1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					firstRepeating = arr[i];
					break;
				}
			}
			if (firstRepeating != -1) {
				break;
			}
		}
		if (firstRepeating != -1) {
			System.out.println("First repeating element: " + firstRepeating);
		} else {
			System.out.println("No repeating elements found");
		}
		sc.close();
	}
}
