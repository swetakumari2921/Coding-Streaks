package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex23 {

	static class Pair {
		int row;
		int col;

		Pair(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		int oldColor = image[sr][sc];

		if (oldColor == newColor) {
			return image;
		}

		int rows = image.length;
		int cols = image[0].length;

		Queue<Pair> queue = new LinkedList<>();

		queue.add(new Pair(sr, sc));
		image[sr][sc] = newColor;

		int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

		while (!queue.isEmpty()) {

			Pair current = queue.poll();

			for (int[] dir : directions) {

				int newRow = current.row + dir[0];
				int newCol = current.col + dir[1];

				if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && image[newRow][newCol] == oldColor) {

					image[newRow][newCol] = newColor;
					queue.add(new Pair(newRow, newCol));
				}
			}
		}

		return image;
	}

	public static void main(String[] args) {

		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		int sr = 1;
		int sc = 1;
		int newColor = 2;

		int[][] result = floodFill(image, sr, sc, newColor);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
