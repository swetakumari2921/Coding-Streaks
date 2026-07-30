package my.stack.practice;

import java.util.Stack;

public class Ex32 {

	public static int scoreOfParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				stack.push(0);
			} else {
				int value = stack.pop();
				int score = Math.max(2 * value, 1);
				stack.push(stack.pop() + score);
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {
		String s = "(()(()))";

		System.out.println("Parentheses: " + s);
		System.out.println("Score: " + scoreOfParentheses(s));
	}
}
