package my.arrays.practice;

import java.util.Scanner;

// Find all pairs with a given sum.

public class Ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        System.out.println("Pairs with sum " + targetSum + " are:");

        boolean found = false;

        // Finding pairs using array only
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();

	}
}
