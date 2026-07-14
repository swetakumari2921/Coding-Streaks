package my.stack.practice;

import java.util.Stack;

public class Ex16 {

	static int evaluatePrefix(String expression) {

		Stack<Integer> stack = new Stack<>();

		// Scan expression from right to left
		for (int i = expression.length() - 1; i >= 0; i--) {

			char ch = expression.charAt(i);

			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {

				int operand1 = stack.pop();
				int operand2 = stack.pop();

				switch (ch) {

				case '+':
					stack.push(operand1 + operand2);
					break;

				case '-':
					stack.push(operand1 - operand2);
					break;

				case '*':
					stack.push(operand1 * operand2);
					break;

				case '/':
					stack.push(operand1 / operand2);
					break;
				}
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {

		String expression = "-+7*45+20";

		int result = evaluatePrefix(expression);

		System.out.println("Result = " + result);
	}
}
