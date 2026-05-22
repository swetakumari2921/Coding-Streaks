package my.collection.linkedlist.practice;

class ListNode17 {
	int val;
	ListNode17 next;

	ListNode17(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex145 {

	public static int[] toArray(ListNode17 head) {

		// step 1: find size
		int size = 0;
		ListNode17 temp = head;

		while (temp != null) {
			size++;
			temp = temp.next;
		}

		// step 2: create array
		int[] arr = new int[size];

		// step 3: copy values
		temp = head;
		int i = 0;

		while (temp != null) {
			arr[i] = temp.val;
			i++;
			temp = temp.next;
		}

		return arr;
	}

	public static void main(String[] args) {

		// Creating LinkedList: 5 -> 10 -> 15 -> 20
		ListNode17 head = new ListNode17(5);
		head.next = new ListNode17(10);
		head.next.next = new ListNode17(15);
		head.next.next.next = new ListNode17(20);

		int[] result = toArray(head);

		// print array
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
