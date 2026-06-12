package my.arrays.practice;

import java.util.Scanner;

public class Ex189 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
					sum += arr[i][j];
				}
			}
		}

		System.out.println("Sum of boundary elements: " + sum);

		sc.close();
	}
}
