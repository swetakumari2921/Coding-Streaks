package my.arrays.practice;

public class Ex191 {

	public static void printAntiDiagonal(int[][] mat) {
		int n = mat.length;

		System.out.print("Anti-diagonal elements: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][n - 1 - i] + " ");
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printAntiDiagonal(mat);
	}
}
