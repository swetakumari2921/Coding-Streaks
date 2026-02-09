package my.arrays.practice;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of matrix: ");
		int n = sc.nextInt();

		int[][] a = new int[n][n];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int start = 0;
			int end = n - 1;
			while (start < end) {
				int temp = a[i][start];
				a[i][start] = a[i][end];
				a[i][end] = temp;
				start++;
				end--;
			}
		}

		System.out.println("Matrix after 90 degree rotation:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
