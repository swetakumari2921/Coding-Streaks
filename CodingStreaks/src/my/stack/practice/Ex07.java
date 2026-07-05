package my.stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			stack.push(sc.nextInt());
		}

		System.out.println("Stack: " + stack);
		System.out.println("Size of stack: " + stack.size());

		sc.close();
	}
}
