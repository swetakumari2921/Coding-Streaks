package my.queue.practice;

class QueueNode {
	int data;
	QueueNode next;

	QueueNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	QueueNode front, rear;

	Queue() {
		front = rear = null;
	}

	void enqueue(int data) {
		QueueNode newNode = new QueueNode(data);

		if (rear == null) {
			front = rear = newNode;
			return;
		}

		rear.next = newNode;
		rear = newNode;
	}

	int dequeue() {
		if (front == null) {
			System.out.println("Queue Underflow");
			return -1;
		}

		int value = front.data;
		front = front.next;

		if (front == null)
			rear = null;

		return value;
	}

	void display() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return;
		}

		QueueNode temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Ex02 {
	public static void main(String[] args) {

		Queue q = new Queue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);

		System.out.print("Queue: ");
		q.display();

		System.out.println("Dequeued: " + q.dequeue());

		System.out.print("Queue after Dequeue: ");
		q.display();
	}
}
