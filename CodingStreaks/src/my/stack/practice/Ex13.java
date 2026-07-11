package my.stack.practice;

import java.util.Stack;

public class Ex13 {

	// Returns precedence of operators
	static int precedence(char ch) {
		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '^')
			return 3;
		return -1;
	}

	// Convert infix expression to postfix
	static String infixToPostfix(String exp) {

		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < exp.length(); i++) {

			char ch = exp.charAt(i);

			// Ignore spaces
			if (ch == ' ')
				continue;

			// Operand
			if (Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}

			// Opening bracket
			else if (ch == '(') {
				stack.push(ch);
			}

			// Closing bracket
			else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				if (!stack.isEmpty()) {
					stack.pop(); // Remove '('
				}
			}

			// Operator
			else {
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		// Pop remaining operators
		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}

		return postfix.toString();
	}

	public static void main(String[] args) {

		String infix = "A+B*(C-D)";

		System.out.println("Infix Expression  : " + infix);
		System.out.println("Postfix Expression: " + infixToPostfix(infix));
	}
}
