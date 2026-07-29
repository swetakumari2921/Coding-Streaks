package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex31 {

	static class Cell {
		int row;
		int col;
		int time;

		Cell(int row, int col, int time) {
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}

	public static int minimumTimeToRot(int[][] grid) {

		int rows = grid.length;
		int cols = grid[0].length;

		Queue<Cell> queue = new LinkedList<>();

		int fresh = 0;

		// Add all rotten oranges into queue
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				if (grid[i][j] == 2) {
					queue.add(new Cell(i, j, 0));
				} else if (grid[i][j] == 1) {
					fresh++;
				}
			}
		}

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		int time = 0;

		while (!queue.isEmpty()) {

			Cell current = queue.poll();

			time = Math.max(time, current.time);

			for (int k = 0; k < 4; k++) {

				int nr = current.row + dr[k];
				int nc = current.col + dc[k];

				if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {

					grid[nr][nc] = 2;
					fresh--;

					queue.add(new Cell(nr, nc, current.time + 1));
				}
			}
		}

		return fresh == 0 ? time : -1;
	}

	public static void main(String[] args) {

		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };

		System.out.println("Minimum Time: " + minimumTimeToRot(grid));
	}
}
