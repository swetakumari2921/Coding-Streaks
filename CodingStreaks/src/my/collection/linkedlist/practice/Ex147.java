package my.collection.linkedlist.practice;

class ListNode18 {

	int data;
	ListNode18 next;

	ListNode18(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex147 {

	public static int findSmallest(ListNode18 head) {

		if (head == null) {
			return -1;
		}

		int min = head.data;

		ListNode18 temp = head;

		while (temp != null) {

			if (temp.data < min) {
				min = temp.data;
			}

			temp = temp.next;
		}

		return min;
	}

	public static void main(String[] args) {

		ListNode18 head = new ListNode18(25);
		head.next = new ListNode18(10);
		head.next.next = new ListNode18(40);
		head.next.next.next = new ListNode18(5);
		head.next.next.next.next = new ListNode18(18);

		int smallest = findSmallest(head);

		System.out.println("Smallest node value = " + smallest);
	}
}
