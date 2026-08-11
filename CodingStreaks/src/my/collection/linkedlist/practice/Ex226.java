package my.collection.linkedlist.practice;

public class Ex226 {

	// Node of LFU Cache
	static class Node {
		int key;
		int value;
		int frequency;

		Node prev;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.frequency = 1;
		}
	}

	private Node head;
	private Node tail;
	private int capacity;
	private int size;

	public Ex226(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	// Add node at front
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

	// Remove node
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

	// Find node by key
	private Node find(int key) {

		Node current = head;

		while (current != null) {

			if (current.key == key) {
				return current;
			}

			current = current.next;
		}

		return null;
	}

	// Get value
	public int get(int key) {

		Node node = find(key);

		if (node == null) {
			return -1;
		}

		// Increase frequency
		node.frequency++;

		// Make recently used
		moveToFront(node);

		return node.value;
	}

	// Put key-value
	public void put(int key, int value) {

		if (capacity <= 0) {
			return;
		}

		Node node = find(key);

		// Key already exists
		if (node != null) {

			node.value = value;
			node.frequency++;

			// Make recently used
			moveToFront(node);

			return;
		}

		// Cache is full
		if (size >= capacity) {

			Node lfu = findLFU();

			remove(lfu);
		}

		// Add new node
		Node newNode = new Node(key, value);

		addFirst(newNode);
	}

	// Find least frequently used node
	private Node findLFU() {

		Node current = head;
		Node lfu = head;

		while (current != null) {

			if (current.frequency < lfu.frequency) {

				lfu = current;

			} else if (current.frequency == lfu.frequency) {

				// Since the list is ordered from
				// most recently used to least recently used,
				// the later node is less recently used.
				lfu = current;
			}

			current = current.next;
		}

		return lfu;
	}

	// Display cache
	public void display() {

		Node current = head;

		System.out.print("Cache: ");

		while (current != null) {

			System.out.print("(" + current.key + "," + current.value + ",freq=" + current.frequency + ") ");

			current = current.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Ex226 cache = new Ex226(3);

		cache.put(1, 100);
		cache.put(2, 200);
		cache.put(3, 300);

		cache.display();

		// Increase frequency of key 1
		cache.get(1);
		cache.get(1);

		// Increase frequency of key 2
		cache.get(2);

		cache.display();

		// Key 3 has frequency 1,
		// so it will be removed.
		cache.put(4, 400);

		cache.display();

		System.out.println("Get 3: " + cache.get(3));
		System.out.println("Get 4: " + cache.get(4));

		cache.display();
	}
}
