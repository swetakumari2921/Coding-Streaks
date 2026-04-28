package my.collection.linkedlist.practice;

class Node60 {
	int data;
	Node60 next;

	Node60(int data) {
		this.data = data;
		this.next = null;
	}
}

class QueueLinkedList {
	Node60 front;
	Node60 rear;

	void enqueue(int data) {
		Node60 newNode = new Node60(data);

		if (rear == null) {
			front = rear = newNode;
			return;
		}

		rear.next = newNode;
		rear = newNode;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		int val = front.data;
		front = front.next;

		if (front == null) {
			rear = null;
		}

		return val;
	}

	int peek() {
		if (front == null) {
			return -1;
		}
		return front.data;
	}
}

public class Ex116 {
	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.println(q.dequeue());
		System.out.println(q.peek());
	}
}
