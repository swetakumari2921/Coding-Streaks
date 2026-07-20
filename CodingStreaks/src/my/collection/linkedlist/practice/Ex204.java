package my.collection.linkedlist.practice;

class ListNode70 {
	int data;
	ListNode70 next;

	ListNode70(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex204 {

	public static ListNode70 getIntersectionNode(ListNode70 head1, ListNode70 head2) {

		if (head1 == null || head2 == null)
			return null;

		ListNode70 p1 = head1;
		ListNode70 p2 = head2;

		while (p1 != p2) {
			p1 = (p1 == null) ? head2 : p1.next;
			p2 = (p2 == null) ? head1 : p2.next;
		}

		return p1;
	}

	public static void main(String[] args) {

		// Common part
		ListNode70 common = new ListNode70(8);
		common.next = new ListNode70(10);
		common.next.next = new ListNode70(12);

		// First LinkedList
		ListNode70 head1 = new ListNode70(3);
		head1.next = new ListNode70(6);
		head1.next.next = new ListNode70(9);
		head1.next.next.next = common;

		// Second LinkedList
		ListNode70 head2 = new ListNode70(4);
		head2.next = common;

		ListNode70 intersection = getIntersectionNode(head1, head2);

		if (intersection != null)
			System.out.println("Intersection Node: " + intersection.data);
		else
			System.out.println("No Intersection");
	}
}
