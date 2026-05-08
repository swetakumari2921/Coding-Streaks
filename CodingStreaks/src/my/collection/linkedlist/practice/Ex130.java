package my.collection.linkedlist.practice;

class ListNode5 {
	int val;
	ListNode5 next;

	ListNode5(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex130 {

	// Function to remove nodes with value less than X
	static ListNode5 removeLessThanX(ListNode5 head, int x) {

		// Remove starting nodes less than x
		while (head != null && head.val < x) {
			head = head.next;
		}

		ListNode5 curr = head;

		while (curr != null && curr.next != null) {

			if (curr.next.val < x) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return head;
	}

	// Function to print linked list
	static void printList(ListNode5 head) {

		ListNode5 temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {

		// Creating linked list
		ListNode5 head = new ListNode5(5);
		head.next = new ListNode5(2);
		head.next.next = new ListNode5(10);
		head.next.next.next = new ListNode5(3);
		head.next.next.next.next = new ListNode5(15);
		head.next.next.next.next.next = new ListNode5(1);

		int x = 5;

		System.out.println("Original List:");
		printList(head);

		head = removeLessThanX(head, x);

		System.out.println("After Removing Nodes Less Than " + x + ":");
		printList(head);
	}
}
