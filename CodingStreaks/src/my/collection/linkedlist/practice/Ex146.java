package my.collection.linkedlist.practice;

public class Ex146 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		// Simulated stack using array
		int n = arr.length;
		int[] stack = new int[n];
		int top = -1;

		// PUSH operation (fill stack)
		for (int i = 0; i < n; i++) {
			stack[++top] = arr[i];
		}

		// POP operation (reverse print)
		System.out.println("Reverse order:");
		while (top >= 0) {
			System.out.print(stack[top] + " ");
			top--;
		}
	}
}
