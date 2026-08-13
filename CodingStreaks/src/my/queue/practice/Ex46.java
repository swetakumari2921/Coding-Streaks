package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex46 {

	static class Node {
		int position;
		int moves;

		Node(int position, int moves) {
			this.position = position;
			this.moves = moves;
		}
	}

	public static int minDiceThrows(int[] board) {

		int n = board.length;

		boolean[] visited = new boolean[n];

		Queue<Node> queue = new LinkedList<>();

		// Start from position 0
		queue.add(new Node(0, 0));
		visited[0] = true;

		while (!queue.isEmpty()) {

			Node current = queue.poll();

			// Reached final position
			if (current.position == n - 1) {
				return current.moves;
			}

			// Try dice values 1 to 6
			for (int dice = 1; dice <= 6; dice++) {

				int next = current.position + dice;

				if (next >= n) {
					continue;
				}

				// Snake or ladder
				if (board[next] != -1) {
					next = board[next];
				}

				if (!visited[next]) {

					visited[next] = true;

					queue.add(new Node(next, current.moves + 1));
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] board = new int[30];

		// No snake or ladder
		for (int i = 0; i < board.length; i++) {
			board[i] = -1;
		}

		// Ladders
		board[2] = 21;
		board[4] = 7;
		board[10] = 25;
		board[19] = 28;

		// Snakes
		board[26] = 0;
		board[20] = 8;
		board[16] = 3;
		board[18] = 6;

		int result = minDiceThrows(board);

		System.out.println("Minimum dice throws: " + result);
	}
}
