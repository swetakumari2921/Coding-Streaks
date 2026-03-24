package my.collection.linkedlist.practice;

class node30 {
	int data;
	node30 next;

	node30(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex80 {
	node30 head;

	// Insert at end (helper)
	void insert(int data) {
		node30 newNode = new node30(data);
		if (head == null) {
			head = newNode;
			return;
		}
		node30 temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = newNode;
	}

	// Delete from beginning
	void deleteBeginning() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next; // move head to next node
	}

	// Print list
	void printList() {
		node30 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Ex80 list = new Ex80();

		list.insert(10);
		list.insert(20);
		list.insert(30);

		System.out.print("Original List: ");
		list.printList();

		list.deleteBeginning();
		System.out.print("After Deletion: ");
		list.printList();
	}
}
