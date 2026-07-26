package my.stack.practice;

import java.util.Stack;

public class Ex28 {

	public static String simplifyPath(String path) {

		Stack<String> stack = new Stack<>();

		String[] parts = path.split("/");

		for (String part : parts) {

			// Ignore empty and current directory "."
			if (part.equals("") || part.equals(".")) {
				continue;
			}

			// Move to parent directory
			if (part.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
			// Add directory name
			else {
				stack.push(part);
			}
		}

		StringBuilder result = new StringBuilder();

		for (String dir : stack) {
			result.append("/").append(dir);
		}

		return result.length() == 0 ? "/" : result.toString();
	}

	public static void main(String[] args) {

		String path = "/home//user/../documents/./file";

		System.out.println("Simplified Path: " + simplifyPath(path));
	}
}
