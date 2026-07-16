package my.stack.practice;

import java.util.Stack;
import java.util.Scanner;

public class Ex18 {

	public static void nextGreaterElement(int[] arr) {

		int n = arr.length;
		Stack<Integer> stack = new Stack<>();

		int[] result = new int[n];

		// Traverse from right side
		for (int i = n - 1; i >= 0; i--) {

			// Remove smaller elements
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}

			// If stack is empty, no greater element
			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}

			// Push current element
			stack.push(arr[i]);
		}

		System.out.println("Next Greater Elements:");
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		nextGreaterElement(arr);

		sc.close();
	}
}