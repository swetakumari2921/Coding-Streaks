package my.queue.practice;

public class Ex01 {

	static class Queue {
		int[] arr;
		int front;
		int rear;
		int size;

		Queue(int size) {
			this.size = size;
			arr = new int[size];
			front = -1;
			rear = -1;
		}

		// enqueue (insert)
		void enqueue(int value) {
			if (rear == size - 1) {
				System.out.println("Queue Overflow");
				return;
			}

			if (front == -1) {
				front = 0;
			}

			arr[++rear] = value;
		}

		// dequeue (remove)
		int dequeue() {
			if (front == -1 || front > rear) {
				System.out.println("Queue Underflow");
				return -1;
			}

			return arr[front++];
		}

		// peek front element
		int peek() {
			if (front == -1 || front > rear) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}

		// check empty
		boolean isEmpty() {
			return front == -1 || front > rear;
		}

		// display queue
		void display() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return;
			}

			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue(5);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);

		System.out.println("Queue elements:");
		q.display();

		System.out.println("Front element: " + q.peek());

		System.out.println("Removed: " + q.dequeue());

		System.out.println("Queue after dequeue:");
		q.display();
	}
}
