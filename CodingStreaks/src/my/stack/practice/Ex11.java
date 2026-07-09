package my.stack.practice;

import java.util.Stack;

public class Ex11 {

	static boolean isBalanced(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// Opening brackets
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			// Closing brackets
			else if (ch == ')' || ch == '}' || ch == ']') {

				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {

					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String str = "{[()]}";

		if (isBalanced(str)) {
			System.out.println("Balanced Parentheses");
		} else {
			System.out.println("Not Balanced Parentheses");
		}
	}
}
