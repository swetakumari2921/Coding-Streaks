package my.collection.linkedlist.practice;

class ListNode39 {
	int data;
	ListNode39 next;

	ListNode39(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex171 {

	public static ListNode39 mergeLists(ListNode39 head1, ListNode39 head2) {

		if (head1 == null) {
			return head2;
		}

		ListNode39 temp = head1;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = head2;

		return head1;
	}

	public static void printList(ListNode39 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode39 head1 = new ListNode39(10);
		head1.next = new ListNode39(30);
		head1.next.next = new ListNode39(20);

		ListNode39 head2 = new ListNode39(5);
		head2.next = new ListNode39(15);
		head2.next.next = new ListNode39(25);

		ListNode39 mergedHead = mergeLists(head1, head2);

		printList(mergedHead);
	}
}
