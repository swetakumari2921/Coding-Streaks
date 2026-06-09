package my.arrays.practice;

public class Ex185 {
	public static boolean isSymmetric(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		if (isSymmetric(matrix)) {
			System.out.println("Symmetric Matrix");
		} else {
			System.out.println("Not Symmetric Matrix");
		}
	}
}
