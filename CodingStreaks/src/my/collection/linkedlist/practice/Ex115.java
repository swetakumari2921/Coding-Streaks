package my.collection.linkedlist.practice;

class Node59 {
	int data;
	Node59 next;

	Node59(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex115 {
	Node59 top;

	void push(int data) {
		Node59 newNode = new Node59(data);
		newNode.next = top;
		top = newNode;
		System.out.println(data + " pushed");
	}

	void pop() {
		if (top == null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(top.data + " popped");
		top = top.next;
	}

	void peek() {
		if (top == null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top element: " + top.data);
	}

	void display() {
		Node59 temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Ex115 s = new Ex115();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println();
		s.peek();
		s.pop();
		s.display();
	}
}
