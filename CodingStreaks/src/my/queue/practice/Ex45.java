package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex45 {

	static class Cell {
		int row;
		int col;

		Cell(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static void waterFill(int[][] grid, int startRow, int startCol) {

		int rows = grid.length;
		int cols = grid[0].length;

		Queue<Cell> queue = new LinkedList<>();

		// Add starting cell
		queue.add(new Cell(startRow, startCol));

		// Mark source as filled
		grid[startRow][startCol] = 2;

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		while (!queue.isEmpty()) {

			Cell current = queue.poll();

			for (int i = 0; i < 4; i++) {

				int newRow = current.row + dr[i];
				int newCol = current.col + dc[i];

				// Check boundaries
				if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {

					// 0 means empty cell
					if (grid[newRow][newCol] == 0) {

						grid[newRow][newCol] = 2;

						queue.add(new Cell(newRow, newCol));
					}
				}
			}
		}
	}

	public static void display(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter columns: ");
		int cols = sc.nextInt();

		int[][] grid = new int[rows][cols];

		System.out.println("Enter grid (0 = empty, 1 = blocked):");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter water source row: ");
		int startRow = sc.nextInt();

		System.out.print("Enter water source column: ");
		int startCol = sc.nextInt();

		System.out.println("\nBefore water fill:");
		display(grid);

		waterFill(grid, startRow, startCol);

		System.out.println("\nAfter water fill:");
		display(grid);

		sc.close();
	}
}
