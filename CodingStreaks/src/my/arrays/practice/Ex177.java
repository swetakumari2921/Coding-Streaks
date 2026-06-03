package my.arrays.practice;

import java.util.Scanner;

public class Ex177 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int xor = 0;

		for (int i = 0; i < n; i++) {
			xor ^= arr[i];
		}

		for (int i = 1; i <= n; i++) {
			xor ^= i;
		}

		int setBit = xor & -xor;

		int x = 0;
		int y = 0;

		for (int i = 0; i < n; i++) {
			if ((arr[i] & setBit) != 0)
				x ^= arr[i];
			else
				y ^= arr[i];
		}

		for (int i = 1; i <= n; i++) {
			if ((i & setBit) != 0)
				x ^= i;
			else
				y ^= i;
		}

		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Repeating Number = " + x);
			System.out.println("Missing Number = " + y);
		} else {
			System.out.println("Repeating Number = " + y);
			System.out.println("Missing Number = " + x);
		}

		sc.close();
	}
}
