package my.stack.practice;

import java.util.Stack;

public class Ex24 {

	public static int trapWater(int[] height) {
		Stack<Integer> stack = new Stack<>();
		int water = 0;

		for (int i = 0; i < height.length; i++) {

			while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

				int top = stack.pop();

				if (stack.isEmpty())
					break;

				int distance = i - stack.peek() - 1;
				int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];

				water += distance * boundedHeight;
			}

			stack.push(i);
		}

		return water;
	}

	public static void main(String[] args) {
		int[] height = { 4, 2, 0, 3, 2, 5 };

		System.out.println("Trapped Water: " + trapWater(height));
	}
}
