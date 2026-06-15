package my.arrays.practice;

public class Ex192 {

	public static void rotate180(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Reverse rows
		for (int i = 0; i < rows / 2; i++) {
			for (int j = 0; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[rows - 1 - i][j];
				matrix[rows - 1 - i][j] = temp;
			}
		}

		// Reverse each row
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][cols - 1 - j];
				matrix[i][cols - 1 - j] = temp;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotate180(matrix);

		System.out.println("\nMatrix After 180 Degree Rotation:");
		printMatrix(matrix);
	}
}
