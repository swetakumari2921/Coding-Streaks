package my.arrays.practice;

import java.util.Scanner;

public class Ex190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		for (int i = 0; i < n; i++) {
			primaryDiagonal += matrix[i][i];
			secondaryDiagonal += matrix[i][n - 1 - i];
		}

		int difference = Math.abs(primaryDiagonal - secondaryDiagonal);

		System.out.println("Diagonal Difference: " + difference);
	}
}
