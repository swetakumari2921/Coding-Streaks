package my.stack.practice;

class ListNode51 {
	int data;
	ListNode51 next;

	ListNode51(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackUsingLinkedList {

	private ListNode51 top;

	// PUSH operation
	public void push(int value) {
		ListNode51 newNode = new ListNode51(value);
		newNode.next = top;
		top = newNode;
	}

	// POP operation
	public int pop() {
		if (top == null) {
			System.out.println("Stack Underflow");
			return -1;
		}

		int val = top.data;
		top = top.next;
		return val;
	}

	// PEEK operation
	public int peek() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return top.data;
	}

	// CHECK EMPTY
	public boolean isEmpty() {
		return top == null;
	}

	// DISPLAY STACK
	public void display() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}

		ListNode51 temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Ex03 {

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.print("Stack: ");
		stack.display();

		System.out.println("Top element: " + stack.peek());

		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());

		System.out.print("Stack after pop: ");
		stack.display();
	}
}
