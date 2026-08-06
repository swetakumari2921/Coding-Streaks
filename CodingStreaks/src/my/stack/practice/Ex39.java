package my.stack.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex39 {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	// Push element
	void push(int x) {
		q2.add(x);

		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Pop element
	int pop() {
		if (q1.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return q1.remove();
	}

	// Peek top element
	int top() {
		if (q1.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return q1.peek();
	}

	// Check if stack is empty
	boolean isEmpty() {
		return q1.isEmpty();
	}

	public static void main(String[] args) {
		Ex39 s = new Ex39();

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.top()); // 30
		System.out.println(s.pop()); // 30
		System.out.println(s.top()); // 20
		System.out.println(s.isEmpty()); // false
	}
}
