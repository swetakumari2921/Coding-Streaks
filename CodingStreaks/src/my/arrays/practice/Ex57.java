package my.arrays.practice;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int r = sc.nextInt();

		System.out.println("Enter number of columns:");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int top = 0, bottom = r - 1, left = 0, right = c - 1;

		System.out.println("Spiral order:");
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
			}
		}
	}
}
