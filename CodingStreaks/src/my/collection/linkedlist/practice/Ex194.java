package my.collection.linkedlist.practice;

import java.util.Collections;
import java.util.LinkedList;

class ListNode58 {
	int data;
	ListNode58 next;

	ListNode58(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex194 {

	static void reverseOddPositions(ListNode58 head) {

		LinkedList<Integer> oddValues = new LinkedList<>();

		ListNode58 temp = head;
		int position = 1;

		// Store odd-positioned node values
		while (temp != null) {
			if (position % 2 != 0) {
				oddValues.add(temp.data);
			}
			temp = temp.next;
			position++;
		}

		// Reverse the collected values
		Collections.reverse(oddValues);

		// Replace odd-positioned node values
		temp = head;
		position = 1;
		int index = 0;

		while (temp != null) {
			if (position % 2 != 0) {
				temp.data = oddValues.get(index++);
			}
			temp = temp.next;
			position++;
		}
	}

	static void display(ListNode58 head) {
		ListNode58 temp = head;

		while (temp != null) {
			System.out.print(temp.data);

			if (temp.next != null) {
				System.out.print(" -> ");
			}

			temp = temp.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		ListNode58 head = new ListNode58(10);
		head.next = new ListNode58(20);
		head.next.next = new ListNode58(30);
		head.next.next.next = new ListNode58(40);
		head.next.next.next.next = new ListNode58(50);
		head.next.next.next.next.next = new ListNode58(60);
		head.next.next.next.next.next.next = new ListNode58(70);

		System.out.println("Before:");
		display(head);

		reverseOddPositions(head);

		System.out.println("After:");
		display(head);
	}
}
