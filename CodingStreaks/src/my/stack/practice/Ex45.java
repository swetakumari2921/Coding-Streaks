package my.stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class Ex45 {

	public static String decimalToBinary(int number) {

		if (number == 0) {
			return "0";
		}

		Stack<Integer> stack = new Stack<>();

		// Store remainders in stack
		while (number > 0) {
			int remainder = number % 2;
			stack.push(remainder);
			number = number / 2;
		}

		// Pop elements to get binary number
		StringBuilder binary = new StringBuilder();

		while (!stack.isEmpty()) {
			binary.append(stack.pop());
		}

		return binary.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter decimal number: ");
		int number = sc.nextInt();

		String binary = decimalToBinary(number);

		System.out.println("Binary: " + binary);

		sc.close();
	}
}
