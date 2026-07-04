package my.stack.practice;

public class Ex01 {

	static class Stack {
		int[] arr;
		int top;
		int size;

		Stack(int size) {
			this.size = size;
			arr = new int[size];
			top = -1;
		}

		// push operation
		void push(int value) {
			if (top == size - 1) {
				System.out.println("Stack Overflow");
				return;
			}
			arr[++top] = value;
		}

		// pop operation
		int pop() {
			if (top == -1) {
				System.out.println("Stack Underflow");
				return -1;
			}
			return arr[top--];
		}

		// peek operation
		int peek() {
			if (top == -1) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return arr[top];
		}

		// check empty
		boolean isEmpty() {
			return top == -1;
		}

		// display stack
		void display() {
			if (top == -1) {
				System.out.println("Stack is Empty");
				return;
			}
			for (int i = top; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Stack elements:");
		stack.display();

		System.out.println("Top element: " + stack.peek());

		System.out.println("Popped: " + stack.pop());

		System.out.println("Stack after pop:");
		stack.display();
	}
}
