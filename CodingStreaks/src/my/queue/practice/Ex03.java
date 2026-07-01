package my.queue.practice;

class ListNode52 {
	int data;
	ListNode52 next;

	ListNode52(int data) {
		this.data = data;
		this.next = null;
	}
}

class QueueUsingLinkedList {

	private ListNode52 front;
	private ListNode52 rear;

	// ENQUEUE operation
	public void enqueue(int value) {
		ListNode52 newNode = new ListNode52(value);

		// If queue is empty
		if (rear == null) {
			front = rear = newNode;
			return;
		}

		// Insert at rear
		rear.next = newNode;
		rear = newNode;
	}

	// DEQUEUE operation
	public int dequeue() {
		if (front == null) {
			System.out.println("Queue Underflow");
			return -1;
		}

		int val = front.data;
		front = front.next;

		if (front == null) {
			rear = null;
		}

		return val;
	}

	// PEEK operation
	public int peek() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return front.data;
	}

	// DISPLAY queue
	public void display() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return;
		}

		ListNode52 temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Ex03 {

	public static void main(String[] args) {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.print("Queue after enqueue: ");
		queue.display();

		System.out.println("Front element: " + queue.peek());

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());

		System.out.print("Queue after dequeue: ");
		queue.display();
	}
}
