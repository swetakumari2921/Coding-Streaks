package my.stack.practice;

import java.util.Stack;

public class Ex25 {

	// Find celebrity using stack
	public static int findCelebrity(int[][] matrix, int n) {

		Stack<Integer> stack = new Stack<>();

		// Add all people to stack
		for (int i = 0; i < n; i++) {
			stack.push(i);
		}

		// Eliminate non-celebrities
		while (stack.size() > 1) {
			int a = stack.pop();
			int b = stack.pop();

			// If a knows b, a cannot be celebrity
			if (matrix[a][b] == 1) {
				stack.push(b);
			}
			// If a does not know b, b cannot be celebrity
			else {
				stack.push(a);
			}
		}

		// Potential celebrity
		int candidate = stack.pop();

		// Verify candidate
		for (int i = 0; i < n; i++) {

			// Celebrity should not know anyone
			if (matrix[candidate][i] == 1) {
				return -1;
			}

			// Everyone should know celebrity
			if (i != candidate && matrix[i][candidate] == 0) {
				return -1;
			}
		}

		return candidate;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };

		int n = matrix.length;

		int celebrity = findCelebrity(matrix, n);

		if (celebrity == -1) {
			System.out.println("No celebrity exists");
		} else {
			System.out.println("Celebrity is person: " + celebrity);
		}
	}
}
