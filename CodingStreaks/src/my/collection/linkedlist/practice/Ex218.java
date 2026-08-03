package my.collection.linkedlist.practice;

import java.util.ArrayList;

class ListNode83 {
	int data;
	ListNode83 next;

	ListNode83(int data) {
		this.data = data;
	}
}

public class Ex218 {

	public static ArrayList<Integer> findLongestRepeatingPattern(ListNode83 head) {

		ArrayList<Integer> list = new ArrayList<>();

		// Convert LinkedList to ArrayList
		ListNode83 temp = head;
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		}

		int n = list.size();
		ArrayList<Integer> result = new ArrayList<>();

		// Check every possible repeating pattern
		for (int len = n / 2; len >= 1; len--) {

			for (int i = 0; i <= n - 2 * len; i++) {

				boolean same = true;

				for (int j = 0; j < len; j++) {
					if (!list.get(i + j).equals(list.get(i + len + j))) {
						same = false;
						break;
					}
				}

				if (same) {
					for (int j = 0; j < len; j++) {
						result.add(list.get(i + j));
					}
					return result;
				}
			}
		}

		return result;
	}

	public static void printList(ListNode83 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode83 head = new ListNode83(1);
		head.next = new ListNode83(2);
		head.next.next = new ListNode83(3);
		head.next.next.next = new ListNode83(1);
		head.next.next.next.next = new ListNode83(2);
		head.next.next.next.next.next = new ListNode83(3);
		head.next.next.next.next.next.next = new ListNode83(4);

		System.out.print("LinkedList: ");
		printList(head);

		ArrayList<Integer> pattern = findLongestRepeatingPattern(head);

		System.out.println("Longest Repeating Pattern: " + pattern);
	}
}
