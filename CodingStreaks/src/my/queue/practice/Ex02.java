package my.queue.practice;

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

	// Queue class
	static class Queue {
		Node front;
		Node rear;

		// enqueue (insert)
		void enqueue(int value) {
			Node newNode = new Node(value);

			if (rear == null) {
				front = rear = newNode;
				return;
			}

			rear.next = newNode;
			rear = newNode;
		}

		// dequeue (remove)
		int dequeue() {
			if (front == null) {
				System.out.println("Queue Underflow");
				return -1;
			}

			int value = front.data;
			front = front.next;

			if (front == null) {
				rear = null;
			}

			return value;
		}

		// peek front element
		int peek() {
			if (front == null) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return front.data;
		}

		// check empty
		boolean isEmpty() {
			return front == null;
		}

		// display queue
		void display() {
			if (front == null) {
				System.out.println("Queue is Empty");
				return;
			}

			Node temp = front;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue();

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