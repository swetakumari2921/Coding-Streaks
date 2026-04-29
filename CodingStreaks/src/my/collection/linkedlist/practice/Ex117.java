package my.collection.linkedlist.practice;

class Node61 {
	int key;
	int value;
	Node61 prev;
	Node61 next;

	Node61(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class Ex117 {
	int capacity;
	java.util.HashMap<Integer, Node61> map;
	Node61 head;
	Node61 tail;

	Ex117(int capacity) {
		this.capacity = capacity;
		map = new java.util.HashMap<>();
		head = new Node61(0, 0);
		tail = new Node61(0, 0);
		head.next = tail;
		tail.prev = head;
	}

	void addNode(Node61 node) {
		node.next = head.next;
		node.prev = head;
		head.next.prev = node;
		head.next = node;
	}

	void deleteNode(Node61 node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	int get(int key) {
		if (map.containsKey(key)) {
			Node61 node = map.get(key);
			deleteNode(node);
			addNode(node);
			return node.value;
		}
		return -1;
	}

	void put(int key, int value) {
		if (map.containsKey(key)) {
			Node61 node = map.get(key);
			node.value = value;
			deleteNode(node);
			addNode(node);
		} else {
			if (map.size() == capacity) {
				Node61 lru = tail.prev;
				deleteNode(lru);
				map.remove(lru.key);
			}
			Node61 newNode = new Node61(key, value);
			addNode(newNode);
			map.put(key, newNode);
		}
	}

	void display() {
		Node61 temp = head.next;
		while (temp != tail) {
			System.out.print("(" + temp.key + "," + temp.value + ") ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Ex117 cache = new Ex117(3);
		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		cache.display();
	}
}
