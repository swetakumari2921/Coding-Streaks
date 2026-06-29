package my.queue.practice;

class QueueArray {

	int[] queue;
	int front;
	int rear;
	int size;

	QueueArray(int size) {
		this.size = size;
		queue = new int[size];
		front = 0;
		rear = -1;
	}

	// enqueue operation
	void enqueue(int value) {
		if (rear == size - 1) {
			System.out.println("Queue Overflow");
			return;
		}
		queue[++rear] = value;
	}

	// dequeue operation
	int dequeue() {
		if (front > rear) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return queue[front++];
	}

	// peek (front element)
	int peek() {
		if (front > rear) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[front];
	}

	// check empty
	boolean isEmpty() {
		return front > rear;
	}

	// display queue
	void display() {
		if (front > rear) {
			System.out.println("Queue is Empty");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}

public class Ex01 {
	public static void main(String[] args) {

		QueueArray q = new QueueArray(5);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.print("Queue: ");
		q.display();

		System.out.println("Dequeue: " + q.dequeue());
		System.out.println("Front element: " + q.peek());

		System.out.print("After operations: ");
		q.display();
	}
}
