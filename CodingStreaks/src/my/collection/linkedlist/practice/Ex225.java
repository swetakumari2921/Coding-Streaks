package my.collection.linkedlist.practice;

public class Ex225 {

	// Node of Doubly Linked List
	static class Node {
		int key;
		int value;
		Node prev;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int capacity;
	private int size;

	public Ex225(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	// Add node at the front
	private void addFirst(Node node) {

		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}

		size++;
	}

	// Remove a node
	private void remove(Node node) {

		if (node == head) {
			head = node.next;
		}

		if (node == tail) {
			tail = node.prev;
		}

		if (node.prev != null) {
			node.prev.next = node.next;
		}

		if (node.next != null) {
			node.next.prev = node.prev;
		}

		node.prev = null;
		node.next = null;

		size--;
	}

	// Move node to front
	private void moveToFront(Node node) {
		remove(node);
		addFirst(node);
	}

	// Get value
	public int get(int key) {

		Node current = head;

		while (current != null) {

			if (current.key == key) {

				// Make it recently used
				moveToFront(current);

				return current.value;
			}

			current = current.next;
		}

		return -1;
	}

	// Put key-value
	public void put(int key, int value) {

		Node current = head;

		// Check if key already exists
		while (current != null) {

			if (current.key == key) {

				current.value = value;

				// Make it recently used
				moveToFront(current);

				return;
			}

			current = current.next;
		}

		// Create new node
		Node newNode = new Node(key, value);

		addFirst(newNode);

		// Remove least recently used node
		if (size > capacity) {

			Node lru = tail;

			remove(lru);
		}
	}

	// Display cache
	public void display() {

		Node current = head;

		System.out.print("Cache: ");

		while (current != null) {

			System.out.print("(" + current.key + "," + current.value + ") ");

			current = current.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Ex225 cache = new Ex225(3);

		cache.put(1, 100);
		cache.put(2, 200);
		cache.put(3, 300);

		cache.display();

		System.out.println("Get 1: " + cache.get(1));

		cache.display();

		cache.put(4, 400);

		cache.display();

		System.out.println("Get 2: " + cache.get(2));

		cache.display();
	}
}
