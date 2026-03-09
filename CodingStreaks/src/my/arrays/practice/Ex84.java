package my.arrays.practice;

import java.util.Scanner;

public class Ex84 {

	static int kadane(int arr[], int n) {
		int maxSum = arr[0];
		int currentSum = arr[0];

		for (int i = 1; i < n; i++) {
			if (currentSum < 0)
				currentSum = arr[i];
			else
				currentSum += arr[i];

			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int matrix[][] = new int[r][c];

		System.out.println("Enter the matrix elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int maxSum = Integer.MIN_VALUE;

		for (int left = 0; left < c; left++) {

			int temp[] = new int[r];

			for (int right = left; right < c; right++) {

				for (int i = 0; i < r; i++) {
					temp[i] += matrix[i][right];
				}

				int sum = kadane(temp, r);

				if (sum > maxSum)
					maxSum = sum;
			}
		}

		System.out.println("Maximum sum rectangle: " + maxSum);
	}

}
