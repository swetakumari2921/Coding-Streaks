package my.stack.practice;

import java.util.Stack;

public class Ex17 {

	static String removeDuplicates(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop(); // Remove adjacent duplicate
			} else {
				stack.push(ch);
			}
		}

		StringBuilder result = new StringBuilder();

		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}

		return result.reverse().toString();
	}

	public static void main(String[] args) {

		String str = "abbaca";

		System.out.println("Original String: " + str);
		System.out.println("After Removing Duplicates: " + removeDuplicates(str));
	}
}
