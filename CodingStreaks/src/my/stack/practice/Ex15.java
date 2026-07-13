package my.stack.practice;

import java.util.Stack;

public class Ex15 {

	static int evaluatePostfix(String exp) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {

			char ch = exp.charAt(i);

			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {

				int b = stack.pop();
				int a = stack.pop();

				switch (ch) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				case '%':
					stack.push(a % b);
					break;
				}
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {

		String expression = "23*54*+9-";

		System.out.println("Postfix Expression: " + expression);
		System.out.println("Result: " + evaluatePostfix(expression));
	}
}
