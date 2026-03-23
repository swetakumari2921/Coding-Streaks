package my.collection.linkedlist.practice;

class node29 {
	int data;
	node29 next;

	node29(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex79 {
	node29 head;

	// Insert node at a given position (1-based index)
	public void insertAtPosition(int value, int pos) {
		node29 newNode = new node29(value);

		// Insert at beginning
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		node29 temp = head;
		int count = 1;

		// Traverse to the node just before the position
		while (temp != null && count < pos - 1) {
			temp = temp.next;
			count++;
		}

		if (temp == null) {
			System.out.println("Position out of bounds");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Print linked list
	public void printList() {
		node29 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Ex79 list = new Ex79();

		list.insertAtPosition(5, 1); // 5
		list.insertAtPosition(10, 2); // 5 -> 10
		list.insertAtPosition(7, 2); // 5 -> 7 -> 10
		list.insertAtPosition(3, 1); // 3 -> 5 -> 7 -> 10
		list.insertAtPosition(12, 10); // Position out of bounds

		list.printList(); // Output: 3 -> 5 -> 7 -> 10 -> null
	}
}
