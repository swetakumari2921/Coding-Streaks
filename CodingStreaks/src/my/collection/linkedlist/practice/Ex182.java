package my.collection.linkedlist.practice;

class ListNode47 {
	int data;
	ListNode47 next;

	ListNode47(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex182 {

	static void findIntersection(ListNode47 head1, ListNode47 head2) {
		boolean found = false;

		ListNode47 temp1 = head1;

		while (temp1 != null) {
			ListNode47 temp2 = head2;

			while (temp2 != null) {

				if (temp1.data == temp2.data) {
					System.out.println(temp1.data);
					found = true;
					break; // avoid printing same match multiple times for one node
				}

				temp2 = temp2.next;
			}

			temp1 = temp1.next;
		}

		if (!found) {
			System.out.println("No intersection found.");
		}
	}

	public static void main(String[] args) {

		// List 1: 1 -> 2 -> 3 -> 4 -> 5
		ListNode47 head1 = new ListNode47(1);
		head1.next = new ListNode47(2);
		head1.next.next = new ListNode47(3);
		head1.next.next.next = new ListNode47(4);
		head1.next.next.next.next = new ListNode47(5);

		// List 2: 3 -> 5 -> 7 -> 8
		ListNode47 head2 = new ListNode47(3);
		head2.next = new ListNode47(5);
		head2.next.next = new ListNode47(7);
		head2.next.next.next = new ListNode47(8);

		System.out.println("Intersection elements:");
		findIntersection(head1, head2);
	}
}
