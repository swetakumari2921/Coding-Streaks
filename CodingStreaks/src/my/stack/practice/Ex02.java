package my.stack.practice;

public class Ex02 {

	// Node class
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Stack class
	static class Stack {
		Node top;

		// push operation
		void push(int value) {
			Node newNode = new Node(value);
			newNode.next = top;
			top = newNode;
		}

		// pop operation
		int pop() {
			if (top == null) {
				System.out.println("Stack Underflow");
				return -1;
			}
			int value = top.data;
			top = top.next;
			return value;
		}

		// peek operation
		int peek() {
			if (top == null) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return top.data;
		}

		// check empty
		boolean isEmpty() {
			return top == null;
		}

		// display stack
		void display() {
			if (top == null) {
				System.out.println("Stack is Empty");
				return;
			}

			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack();

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
