package my.collection.linkedlist.practice;

class ListNode11 {
	int data;
	ListNode11 next;

	ListNode11(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex137 {

	public static boolean isStrictlyIncreasing(ListNode11 head) {

		if (head == null || head.next == null) {
			return true;
		}

		ListNode11 curr = head;

		while (curr.next != null) {

			if (curr.data >= curr.next.data) {
				return false;
			}

			curr = curr.next;
		}

		return true;
	}

	public static void main(String[] args) {

		ListNode11 head = new ListNode11(2);
		head.next = new ListNode11(4);
		head.next.next = new ListNode11(6);
		head.next.next.next = new ListNode11(10);

		System.out.println(isStrictlyIncreasing(head));
	}
}
