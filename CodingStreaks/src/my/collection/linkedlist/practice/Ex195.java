package my.collection.linkedlist.practice;

class ListNode59 {
	int data;
	ListNode59 next;

	ListNode59(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex195 {

	// Merge two sorted circular linked lists
	static ListNode59 mergeTwo(ListNode59 head1, ListNode59 head2) {

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		// Break the circular lists
		ListNode59 tail1 = head1;
		while (tail1.next != head1) {
			tail1 = tail1.next;
		}
		tail1.next = null;

		ListNode59 tail2 = head2;
		while (tail2.next != head2) {
			tail2 = tail2.next;
		}
		tail2.next = null;

		// Merge two sorted linear lists
		ListNode59 dummy = new ListNode59(-1);
		ListNode59 temp = dummy;
		ListNode59 p1 = head1;
		ListNode59 p2 = head2;

		while (p1 != null && p2 != null) {
			if (p1.data <= p2.data) {
				temp.next = p1;
				p1 = p1.next;
			} else {
				temp.next = p2;
				p2 = p2.next;
			}
			temp = temp.next;
		}

		if (p1 != null)
			temp.next = p1;
		else
			temp.next = p2;

		// Make merged list circular
		ListNode59 head = dummy.next;
		ListNode59 tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;

		return head;
	}

	// Merge k sorted circular linked lists
	static ListNode59 mergeKLists(ListNode59[] lists) {

		if (lists == null || lists.length == 0)
			return null;

		ListNode59 result = lists[0];

		for (int i = 1; i < lists.length; i++) {
			result = mergeTwo(result, lists[i]);
		}

		return result;
	}

	// Create circular linked list
	static ListNode59 createCircular(int[] arr) {

		if (arr.length == 0)
			return null;

		ListNode59 head = new ListNode59(arr[0]);
		ListNode59 temp = head;

		for (int i = 1; i < arr.length; i++) {
			temp.next = new ListNode59(arr[i]);
			temp = temp.next;
		}

		temp.next = head;
		return head;
	}

	// Print circular linked list
	static void printCircular(ListNode59 head) {

		if (head == null)
			return;

		ListNode59 temp = head;

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

	public static void main(String[] args) {

		ListNode59 list1 = createCircular(new int[] { 1, 4, 7 });
		ListNode59 list2 = createCircular(new int[] { 2, 5, 8 });
		ListNode59 list3 = createCircular(new int[] { 3, 6, 9 });

		ListNode59[] lists = { list1, list2, list3 };

		System.out.println("Merged Circular Linked List:");
		ListNode59 merged = mergeKLists(lists);
		printCircular(merged);
	}
}
