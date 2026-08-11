package my.stack.practice;

import java.util.Stack;

public class Ex43 {

	static boolean hasRedundantBrackets(String expression) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {

			char ch = expression.charAt(i);

			// Push everything except closing bracket
			if (ch != ')') {
				stack.push(ch);
			} else {

				boolean operatorFound = false;

				// Remove elements until '('
				while (!stack.isEmpty() && stack.peek() != '(') {

					char top = stack.pop();

					if (top == '+' || top == '-' || top == '*' || top == '/') {

						operatorFound = true;
					}
				}

				// Remove '('
				if (!stack.isEmpty()) {
					stack.pop();
				}

				// No operator means redundant brackets
				if (!operatorFound) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		String expression1 = "((a+b))";
		String expression2 = "(a+(b*c))";
		String expression3 = "(a+b)";

		System.out.println("Expression 1: " + hasRedundantBrackets(expression1));

		System.out.println("Expression 2: " + hasRedundantBrackets(expression2));

		System.out.println("Expression 3: " + hasRedundantBrackets(expression3));
	}
}
