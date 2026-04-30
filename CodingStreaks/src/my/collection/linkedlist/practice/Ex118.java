package my.collection.linkedlist.practice;

class Node62 {
	int key;
	int value;
	int freq;
	Node62 next;

	Node62(int key, int value) {
		this.key = key;
		this.value = value;
		this.freq = 1;
		this.next = null;
	}
}

class LFUCache {

	Node62 head;
	int capacity;
	int size;

	LFUCache(int capacity) {
		this.capacity = capacity;
		this.head = null;
		this.size = 0;
	}

	public int get(int key) {

		Node62 curr = head;

		while (curr != null) {
			if (curr.key == key) {
				curr.freq++;
				return curr.value;
			}
			curr = curr.next;
		}

		return -1;
	}

	public void put(int key, int value) {

		if (capacity == 0)
			return;

		Node62 curr = head;

		// if key exists update
		while (curr != null) {
			if (curr.key == key) {
				curr.value = value;
				curr.freq++;
				return;
			}
			curr = curr.next;
		}

		// if space available
		if (size < capacity) {
			Node62 newNode = new Node62(key, value);
			newNode.next = head;
			head = newNode;
			size++;
		} else {
			removeLFU();
			Node62 newNode = new Node62(key, value);
			newNode.next = head;
			head = newNode;
		}
	}

	void removeLFU() {

		Node62 curr = head;
		Node62 prev = null;

		Node62 lfu = head;
		Node62 lfuPrev = null;

		while (curr != null) {

			if (curr.freq < lfu.freq) {
				lfu = curr;
				lfuPrev = prev;
			}

			prev = curr;
			curr = curr.next;
		}

		if (lfuPrev == null) {
			head = head.next;
		} else {
			lfuPrev.next = lfu.next;
		}

		size--;
	}
}

public class Ex118 {
	public static void main(String[] args) {

		LFUCache cache = new LFUCache(2);

		cache.put(1, 100);
		cache.put(2, 200);

		System.out.println(cache.get(1)); // freq of 1 increases

		cache.put(3, 300); // removes LFU (key 2)

		System.out.println(cache.get(2)); // -1
		System.out.println(cache.get(3)); // 300
	}
}
