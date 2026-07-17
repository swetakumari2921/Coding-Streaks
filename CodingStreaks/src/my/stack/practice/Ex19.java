package my.stack.practice;

import java.util.Arrays;
import java.util.Stack;

public class Ex19 {

	public static int[] nextSmaller(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 8, 5, 2, 25 };

		int[] result = nextSmaller(arr);

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Next Smaller Elements: " + Arrays.toString(result));
	}
}
