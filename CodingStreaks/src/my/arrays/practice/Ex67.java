package my.arrays.practice;

import java.util.Scanner;

public class Ex67 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		System.out.println("Enter matrix elements row by row:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int maxSum = Integer.MIN_VALUE;

		for (int left = 0; left < cols; left++) {

			int[] temp = new int[rows];

			for (int right = left; right < cols; right++) {

				for (int i = 0; i < rows; i++) {
					temp[i] += arr[i][right];
				}

				int currentSum = temp[0];
				int bestSum = temp[0];

				for (int i = 1; i < rows; i++) {
					currentSum = Math.max(temp[i], currentSum + temp[i]);
					bestSum = Math.max(bestSum, currentSum);
				}

				maxSum = Math.max(maxSum, bestSum);
			}
		}

		System.out.println("Maximum sum rectangle in the matrix is: " + maxSum);
	}
}
