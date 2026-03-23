package my.collection.linkedlist.practice;

class node28 {
	int data;
	node28 next;

	node28(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex78 {
	node28 head;

	public void insertAtEnd(int value) {
		node28 newNode = new node28(value);

		if (head == null) {
			head = newNode;
			return;
		}

		node28 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	public void printList() {
		node28 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Ex78 list = new Ex78();

		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(15);

		list.printList();
	}
}
