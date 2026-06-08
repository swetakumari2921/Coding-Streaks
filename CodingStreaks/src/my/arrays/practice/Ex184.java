package my.arrays.practice;

public class Ex184 {
	public static void main(String[] args) {
		int[][] arr = { { 4, 2, 7 }, { 1, 5, 3 }, { 6, 8, 2 } };

		int rows = arr.length;
		int cols = arr[0].length;

		int minSum = Integer.MAX_VALUE;
		int minCol = -1;

		for (int j = 0; j < cols; j++) {
			int sum = 0;

			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}

			if (sum < minSum) {
				minSum = sum;
				minCol = j;
			}
		}

		System.out.println("Column Index: " + minCol);
		System.out.println("Minimum Sum: " + minSum);
	}
}
