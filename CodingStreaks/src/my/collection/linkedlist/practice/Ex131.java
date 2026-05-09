package my.collection.linkedlist.practice;

public class Ex131 {
	static class ListNode6 {
		int data;
		ListNode6 next;

		ListNode6(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static ListNode6 insertBeforeKey(ListNode6 head, int key, int value) {

		ListNode6 newNode = new ListNode6(value);

		// If key is at head
		if (head != null && head.data == key) {
			newNode.next = head;
			return newNode;
		}

		ListNode6 temp = head;

		while (temp != null && temp.next != null) {

			if (temp.next.data == key) {
				newNode.next = temp.next;
				temp.next = newNode;
				return head;
			}

			temp = temp.next;
		}

		return head; // key not found, no insertion
	}

	public static void print(ListNode6 head) {

		ListNode6 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode6 head = new ListNode6(10);
		head.next = new ListNode6(20);
		head.next.next = new ListNode6(30);
		head.next.next.next = new ListNode6(40);

		System.out.println("Before:");
		print(head);

		head = insertBeforeKey(head, 30, 25);

		System.out.println("After:");
		print(head);
	}
}
