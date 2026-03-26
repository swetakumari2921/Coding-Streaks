package my.collection.linkedlist.practice;

class node32 {
	int data;
	node32 next;

	node32(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList32 {
	node32 head;

	void add(int data) {
		node32 newNode = new node32(data);
		if (head == null) {
			head = newNode;
			return;
		}
		node32 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	boolean search(int key) {
		node32 temp = head;
		while (temp != null) {
			if (temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}
}

public class Ex82 {
	public static void main(String[] args) {
		LinkedList32 list = new LinkedList32();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		int key = 30;

		System.out.println(list.search(key));
	}
}
