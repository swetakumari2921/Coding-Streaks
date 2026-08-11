package my.stack.practice;

import java.util.Stack;

public class Ex44 {

	// Check if character is an operator
	static boolean isOperator(char ch) {

		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	// Return operator priority
	static int priority(char ch) {

		if (ch == '+' || ch == '-') {
			return 1;
		}

		if (ch == '*' || ch == '/') {
			return 2;
		}

		return 0;
	}

	// Perform calculation
	static int calculate(int a, int b, char operator) {

		if (operator == '+') {
			return a + b;
		}

		if (operator == '-') {
			return a - b;
		}

		if (operator == '*') {
			return a * b;
		}

		return a / b;
	}

	static int evaluate(String expression) {

		Stack<Integer> numbers = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {

			char ch = expression.charAt(i);

			// Ignore spaces
			if (ch == ' ') {
				continue;
			}

			// If digit, build complete number
			if (Character.isDigit(ch)) {

				int number = 0;

				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {

					number = number * 10 + (expression.charAt(i) - '0');

					i++;
				}

				i--;

				numbers.push(number);
			}

			// Opening bracket
			else if (ch == '(') {

				operators.push(ch);
			}

			// Closing bracket
			else if (ch == ')') {

				while (!operators.isEmpty() && operators.peek() != '(') {

					applyTopOperator(numbers, operators);
				}

				operators.pop();
			}

			// Operator
			else if (isOperator(ch)) {

				while (!operators.isEmpty() && operators.peek() != '(' && priority(operators.peek()) >= priority(ch)) {

					applyTopOperator(numbers, operators);
				}

				operators.push(ch);
			}
		}

		// Apply remaining operators
		while (!operators.isEmpty()) {

			applyTopOperator(numbers, operators);
		}

		return numbers.pop();
	}

	// Apply top operator
	static void applyTopOperator(Stack<Integer> numbers, Stack<Character> operators) {

		int b = numbers.pop();
		int a = numbers.pop();

		char operator = operators.pop();

		int result = calculate(a, b, operator);

		numbers.push(result);
	}

	public static void main(String[] args) {

		String expression = "10 + 2 * (6 - 4)";

		int result = evaluate(expression);

		System.out.println("Expression: " + expression);
		System.out.println("Result: " + result);
	}
}
