package my.stack.practice;

import java.util.Stack;

public class Ex37 {

	public static boolean isPalindrome(String str) {

		Stack<Character> stack = new Stack<>();

		// Push all characters into stack
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}

		// Compare original string with stack elements
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != stack.pop()) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "madam";

		System.out.println("String: " + str);

		if (isPalindrome(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
