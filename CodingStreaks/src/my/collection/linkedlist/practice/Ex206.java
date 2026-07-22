package my.collection.linkedlist.practice;

class ListNode72 {
	int data;
	ListNode72 next;

	ListNode72(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex206 {

	// Delete the given node in O(1) time
	public static void deleteNode(ListNode72 node) {
		if (node == null || node.next == null) {
			System.out.println("Cannot delete the last node.");
			return;
		}

		node.data = node.next.data;
		node.next = node.next.next;
	}

	// Print LinkedList
	public static void printList(ListNode72 head) {
		ListNode72 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode72 head = new ListNode72(10);
		head.next = new ListNode72(20);
		head.next.next = new ListNode72(30);
		head.next.next.next = new ListNode72(40);

		System.out.print("Original List: ");
		printList(head);

		// Delete node containing 20
		deleteNode(head.next);

		System.out.print("After Deletion: ");
		printList(head);
	}
}
