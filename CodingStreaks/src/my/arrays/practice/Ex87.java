package my.arrays.practice;

public class Ex87 {

	public static void findEquilibrium(int[][] mat) {

		int rows = mat.length;
		int cols = mat[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				int left = 0;
				int right = 0;
				int up = 0;
				int down = 0;

				for (int c = 0; c < j; c++) {
					left += mat[i][c];
				}

				for (int c = j + 1; c < cols; c++) {
					right += mat[i][c];
				}

				for (int r = 0; r < i; r++) {
					up += mat[r][j];
				}

				for (int r = i + 1; r < rows; r++) {
					down += mat[r][j];
				}

				if (left == right && up == down) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 3, 5 }, { 2, 2, 2 }, { 5, 3, 1 } };

		findEquilibrium(matrix);
	}
}
