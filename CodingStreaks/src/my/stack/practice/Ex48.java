package my.stack.practice;

import java.util.Stack;

public class Ex48 {

	public static int countValidSubarrays(int[] arr) {

		Stack<Integer> stack = new Stack<>();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			// Remove elements greater than current element
			while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				stack.pop();
			}

			// Number of valid subarrays ending at i
			// based on the monotonic stack
			count += stack.size() + 1;

			stack.push(i);
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 5, 3 };

		int result = countValidSubarrays(arr);

		System.out.println("Count of Valid Subarrays = " + result);
	}
}
