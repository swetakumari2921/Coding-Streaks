package my.stack.practice;

import java.util.Stack;

public class Ex14 {

	static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	static String infixToPrefix(String infix) {

		StringBuilder reversed = new StringBuilder();

		// Reverse infix and swap brackets
		for (int i = infix.length() - 1; i >= 0; i--) {
			char ch = infix.charAt(i);

			if (ch == '(')
				reversed.append(')');
			else if (ch == ')')
				reversed.append('(');
			else
				reversed.append(ch);
		}

		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		// Convert reversed infix to postfix
		for (int i = 0; i < reversed.length(); i++) {
			char ch = reversed.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(stack.peek()) > precedence(ch)) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}

		return postfix.reverse().toString();
	}

	public static void main(String[] args) {

		String infix = "(A-B/C)*(A/K-L)";

		String prefix = infixToPrefix(infix);

		System.out.println("Infix  : " + infix);
		System.out.println("Prefix : " + prefix);
	}
}
