package my.collection.linkedlist.practice;

class node68 {
	int data;
	node68 next;

	node68(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex124 {

	public static node68 deleteNodes(node68 head) {
		if (head == null)
			return null;

		node68 curr = head;
		int max = head.data;

		while (curr != null && curr.next != null) {
			if (curr.next.data < max) {
				// delete node
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
				max = curr.data;
			}
		}
		return head;
	}

	public static void printList(node68 head) {
		node68 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		node68 head = new node68(5);
		head.next = new node68(3);
		head.next.next = new node68(10);
		head.next.next.next = new node68(2);
		head.next.next.next.next = new node68(8);

		head = deleteNodes(head);
		printList(head);
	}
}
