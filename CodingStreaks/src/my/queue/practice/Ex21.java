package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex21 {

	static class Pair {
		int row;
		int col;

		Pair(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static int rottenOranges(int[][] grid) {

		int n = grid.length;
		int m = grid[0].length;

		Queue<Pair> queue = new LinkedList<>();

		int fresh = 0;

		// Add rotten oranges and count fresh oranges
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (grid[i][j] == 2) {
					queue.add(new Pair(i, j));
				}

				if (grid[i][j] == 1) {
					fresh++;
				}
			}
		}

		int time = 0;

		int[] rowDir = { -1, 1, 0, 0 };
		int[] colDir = { 0, 0, -1, 1 };

		// BFS traversal
		while (!queue.isEmpty() && fresh > 0) {

			int size = queue.size();
			time++;

			for (int i = 0; i < size; i++) {

				Pair current = queue.remove();

				for (int d = 0; d < 4; d++) {

					int newRow = current.row + rowDir[d];
					int newCol = current.col + colDir[d];

					if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {

						grid[newRow][newCol] = 2;
						fresh--;

						queue.add(new Pair(newRow, newCol));
					}
				}
			}
		}

		if (fresh > 0) {
			return -1;
		}

		return time;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] grid = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		System.out.println(rottenOranges(grid));

		sc.close();
	}
}
