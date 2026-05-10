package my.collection.linkedlist.practice;

class ListNode6 {
	int val;
	ListNode6 next;

	ListNode6(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex132 {

	public static ListNode6 insertAfterKey(ListNode6 head, int key, int data) {

		ListNode6 temp = head;

		while (temp != null) {

			if (temp.val == key) {

				ListNode6 newNode = new ListNode6(data);

				newNode.next = temp.next;
				temp.next = newNode;

				break;
			}

			temp = temp.next;
		}

		return head;
	}

	// Print linked list
	public static void printList(ListNode6 head) {

		ListNode6 temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		ListNode6 head = new ListNode6(5);
		head.next = new ListNode6(10);
		head.next.next = new ListNode6(15);
		head.next.next.next = new ListNode6(20);

		System.out.println("Original List:");
		printList(head);

		int key = 10;
		int data = 12;

		head = insertAfterKey(head, key, data);

		System.out.println("After inserting " + data + " after " + key + ":");
		printList(head);
	}
}
