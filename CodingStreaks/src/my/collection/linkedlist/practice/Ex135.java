package my.collection.linkedlist.practice;

class ListNode9 {
	int data;
	ListNode9 next;

	ListNode9(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex135 {

	public static int findSum(ListNode9 head) {
		int sum = 0;

		ListNode9 temp = head;

		while (temp != null) {
			sum += temp.data;
			temp = temp.next;
		}

		return sum;
	}

	public static void main(String[] args) {

		ListNode9 head = new ListNode9(5);
		head.next = new ListNode9(10);
		head.next.next = new ListNode9(15);
		head.next.next.next = new ListNode9(20);

		System.out.println("Sum of all nodes: " + findSum(head));
	}
}
