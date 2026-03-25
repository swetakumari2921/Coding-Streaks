package my.collection.linkedlist.practice;

class Node31 {
	int data;
	Node31 next;

	Node31(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex81 {
	Node31 head;

	void deleteFromEnd() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
		Node31 temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	void printList() {
		Node31 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Ex81 list = new Ex81();
		list.head = new Node31(10);
		list.head.next = new Node31(20);
		list.head.next.next = new Node31(30);
		list.deleteFromEnd();
		list.printList();
	}
}
