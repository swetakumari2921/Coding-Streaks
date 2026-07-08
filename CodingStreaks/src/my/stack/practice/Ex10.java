package my.stack.practice;

import java.util.Stack;

public class Ex10 {

	public static void main(String[] args) {

		int number = 12345;

		Stack<Integer> stack = new Stack<>();

		// Push each digit into the stack
		while (number > 0) {
			stack.push(number % 10);
			number /= 10;
		}

		int reverse = 0;
		int place = 1;

		// Pop digits and form the reversed number
		while (!stack.isEmpty()) {
			reverse = reverse + (stack.pop() * place);
			place *= 10;
		}

		System.out.println("Reversed Number: " + reverse);
	}
}
