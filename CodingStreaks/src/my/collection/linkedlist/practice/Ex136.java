package my.collection.linkedlist.practice;

class ListNode10 {
	int data;
	ListNode10 next;

	ListNode10(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex136 {

	public static double findAverage(ListNode10 head) {

		int sum = 0;
		int count = 0;

		ListNode10 temp = head;

		while (temp != null) {
			sum += temp.data;
			count++;
			temp = temp.next;
		}

		return (double) sum / count;
	}

	public static void main(String[] args) {

		// Create LinkedList: 10 -> 20 -> 30 -> 40
		ListNode10 head = new ListNode10(10);
		head.next = new ListNode10(20);
		head.next.next = new ListNode10(30);
		head.next.next.next = new ListNode10(40);

		double average = findAverage(head);

		System.out.println("Average = " + average);
	}
}
