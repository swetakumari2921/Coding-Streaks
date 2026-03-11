package my.collection.linkedlist.practice;

class Node17 {
	int data;
	Node17 next;

	Node17(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex66 {

	public static Node17 removeDuplicatesSorted(Node17 head) {
		Node17 current = head;

		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next; // skip duplicate
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public static Node17 removeDuplicatesUnsorted(Node17 head) {
		Node17 current = head;

		while (current != null) {
			Node17 runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next; // skip duplicate
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}

		return head;
	}

	public static void printList(Node17 head) {
		Node17 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Node17 sortedHead = new Node17(1);
		sortedHead.next = new Node17(1);
		sortedHead.next.next = new Node17(2);
		sortedHead.next.next.next = new Node17(3);
		sortedHead.next.next.next.next = new Node17(3);

		System.out.println("Original Sorted List:");
		printList(sortedHead);

		sortedHead = removeDuplicatesSorted(sortedHead);

		System.out.println("After Removing Duplicates from Sorted List:");
		printList(sortedHead);

		System.out.println();

		Node17 unsortedHead = new Node17(3);
		unsortedHead.next = new Node17(1);
		unsortedHead.next.next = new Node17(2);
		unsortedHead.next.next.next = new Node17(3);
		unsortedHead.next.next.next.next = new Node17(2);

		System.out.println("Original Unsorted List:");
		printList(unsortedHead);

		unsortedHead = removeDuplicatesUnsorted(unsortedHead);

		System.out.println("After Removing Duplicates from Unsorted List:");
		printList(unsortedHead);
	}
}
