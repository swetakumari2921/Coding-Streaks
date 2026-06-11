package my.arrays.practice;

public class Ex187 {
	public static boolean isIdentityMatrix(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			if (matrix[i].length != n) {
				return false; // Not a square matrix
			}

			for (int j = 0; j < n; j++) {
				if (i == j && matrix[i][j] != 1) {
					return false;
				}
				if (i != j && matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		if (isIdentityMatrix(matrix)) {
			System.out.println("Identity Matrix");
		} else {
			System.out.println("Not an Identity Matrix");
		}
	}
}
