package my.stack.practice;

class StackArray {

	int[] stack;
	int top;
	int size;

	// constructor
	StackArray(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	// push operation
	void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = value;
	}

	// pop operation
	int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}

	// peek operation
	int peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack[top];
	}

	// check empty
	boolean isEmpty() {
		return top == -1;
	}

	// display stack
	void display() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}

public class Ex01 {
	public static void main(String[] args) {

		StackArray s = new StackArray(5);

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.print("Stack: ");
		s.display();

		System.out.println("Pop: " + s.pop());
		System.out.println("Peek: " + s.peek());

		System.out.print("After operations: ");
		s.display();
	}
}
