package my.strings.practice;

import java.util.Scanner;

public class Ex77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter parentheses string:");
		String s = sc.nextLine();

		int n = s.length();
		int[] stack = new int[n + 1];
		int top = -1;

		int maxLength = 0;

		stack[++top] = -1;

		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == '(') {
				stack[++top] = i;
			} else {
				top--;
				if (top == -1) {
					stack[++top] = i;
				} else {
					int length = i - stack[top];
					if (length > maxLength) {
						maxLength = length;
					}
				}
			}
		}

		System.out.println("Longest Valid Parentheses Length: " + maxLength);
	}
}
