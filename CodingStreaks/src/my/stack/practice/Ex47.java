package my.stack.practice;

import java.util.Stack;

public class Ex47 {

	public static String removeInvalidParentheses(String str) {

		Stack<Integer> stack = new Stack<>();
		boolean[] remove = new boolean[str.length()];

		// Find invalid parentheses
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '(') {
				stack.push(i);
			}

			else if (ch == ')') {

				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					// No matching '('
					remove[i] = true;
				}
			}
		}

		// Remaining '(' are invalid
		while (!stack.isEmpty()) {
			int index = stack.pop();
			remove[index] = true;
		}

		// Build result
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (!remove[i]) {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		String str = "a)b(c)d)";

		String result = removeInvalidParentheses(str);

		System.out.println("Original String: " + str);
		System.out.println("Valid String: " + result);
	}
}
