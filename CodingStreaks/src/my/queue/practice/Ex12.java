package my.queue.practice;

class CircularQueue {

	int size;
	int[] queue;
	int front;
	int rear;
	int count;

	CircularQueue(int size) {
		this.size = size;
		queue = new int[size];
		front = 0;
		rear = -1;
		count = 0;
	}

	// Insert element
	void enqueue(int data) {

		if (count == size) {
			System.out.println("Queue is Full");
			return;
		}

		rear = (rear + 1) % size;
		queue[rear] = data;
		count++;

		System.out.println(data + " inserted");
	}

	// Remove element
	int dequeue() {

		if (count == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int value = queue[front];

		front = (front + 1) % size;
		count--;

		return value;
	}

	// Get front element
	int peek() {

		if (count == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}

		return queue[front];
	}

	// Display queue
	void display() {

		if (count == 0) {
			System.out.println("Queue is Empty");
			return;
		}

		int index = front;

		for (int i = 0; i < count; i++) {
			System.out.print(queue[index] + " ");
			index = (index + 1) % size;
		}

		System.out.println();
	}
}

public class Ex12 {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue(5);

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);

		cq.display();

		System.out.println("Removed: " + cq.dequeue());
		System.out.println("Removed: " + cq.dequeue());

		cq.enqueue(60);
		cq.enqueue(70);

		cq.display();

		System.out.println("Front element: " + cq.peek());
	}
}
