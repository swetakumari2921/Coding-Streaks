package my.stack.practice;

import java.util.Arrays;
import java.util.Stack;

public class Ex46 {

	public static int[] nextGreaterElements(int[] arr) {

		int n = arr.length;

		int[] result = new int[n];

		Arrays.fill(result, -1);

		Stack<Integer> stack = new Stack<>();

		// Traverse array twice for circular behavior
		for (int i = 2 * n - 1; i >= 0; i--) {

			int index = i % n;

			// Remove elements smaller than or equal to current
			while (!stack.isEmpty() && stack.peek() <= arr[index]) {
				stack.pop();
			}

			// Only fill result during the first traversal
			if (i < n) {
				if (!stack.isEmpty()) {
					result[index] = stack.peek();
				}
			}

			// Add current element to stack
			stack.push(arr[index]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };

		int[] result = nextGreaterElements(arr);

		System.out.println("Input:  " + Arrays.toString(arr));
		System.out.println("Output: " + Arrays.toString(result));
	}
}
