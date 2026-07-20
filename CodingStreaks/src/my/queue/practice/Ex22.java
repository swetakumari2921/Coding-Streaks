package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex22 {

	static class Pair {
		int row;
		int col;

		Pair(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static int countIslands(int[][] grid) {

		int rows = grid.length;
		int cols = grid[0].length;

		int count = 0;

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		Queue<Pair> queue = new LinkedList<>();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (grid[i][j] == 1) {

					count++;

					queue.add(new Pair(i, j));
					grid[i][j] = 0;

					while (!queue.isEmpty()) {

						Pair current = queue.poll();

						for (int k = 0; k < 4; k++) {

							int nr = current.row + dr[k];
							int nc = current.col + dc[k];

							if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {

								queue.add(new Pair(nr, nc));
								grid[nr][nc] = 0;
							}
						}
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[][] grid = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 0 } };

		System.out.println("Number of Islands: " + countIslands(grid));
	}
}
