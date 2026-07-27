package my.stack.practice;

import java.util.Stack;

public class Ex29 {

	public static String removeKDigits(String num, int k) {
		Stack<Character> stack = new Stack<>();

		for (char digit : num.toCharArray()) {
			while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
				stack.pop();
				k--;
			}
			stack.push(digit);
		}

		// Remove remaining digits from the end
		while (k > 0 && !stack.isEmpty()) {
			stack.pop();
			k--;
		}

		// Build the result
		StringBuilder sb = new StringBuilder();
		for (char ch : stack) {
			sb.append(ch);
		}

		// Remove leading zeros
		int index = 0;
		while (index < sb.length() && sb.charAt(index) == '0') {
			index++;
		}

		String result = sb.substring(index);

		return result.isEmpty() ? "0" : result;
	}

	public static void main(String[] args) {
		String num = "1432219";
		int k = 3;

		System.out.println("Smallest number: " + removeKDigits(num, k));
	}
}
