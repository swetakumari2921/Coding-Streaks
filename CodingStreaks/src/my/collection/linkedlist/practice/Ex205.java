package my.collection.linkedlist.practice;

class ListNode71 {
	int data;
	ListNode71 next;

	ListNode71(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex205 {

	public static ListNode71 getIntersectionNode(ListNode71 head1, ListNode71 head2) {
		if (head1 == null || head2 == null) {
			return null;
		}

		ListNode71 p1 = head1;
		ListNode71 p2 = head2;

		while (p1 != p2) {
			p1 = (p1 == null) ? head2 : p1.next;
			p2 = (p2 == null) ? head1 : p2.next;
		}

		return p1;
	}

	public static void main(String[] args) {

		// Common part
		ListNode71 common = new ListNode71(30);
		common.next = new ListNode71(40);
		common.next.next = new ListNode71(50);

		// First LinkedList
		ListNode71 head1 = new ListNode71(10);
		head1.next = new ListNode71(20);
		head1.next.next = common;

		// Second LinkedList
		ListNode71 head2 = new ListNode71(15);
		head2.next = common;

		ListNode71 intersection = getIntersectionNode(head1, head2);

		if (intersection != null) {
			System.out.println("Intersection Node: " + intersection.data);
		} else {
			System.out.println("No Intersection");
		}
	}
}
