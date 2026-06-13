package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode36 {
	int data;
	ListNode36 next;

	ListNode36(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex167 {

	static ListNode36 reversePattern(ListNode36 head) {
		int[] pattern = { 2, 3, 4 };
		int p = 0;

		ListNode36 dummy = new ListNode36(0);
		dummy.next = head;

		ListNode36 prevTail = dummy;
		ListNode36 curr = head;

		while (curr != null) {
			int k = pattern[p];
			p = (p + 1) % 3;

			ListNode36 temp = curr;
			int count = 0;

			while (temp != null && count < k) {
				temp = temp.next;
				count++;
			}

			if (count < k)
				break;

			ListNode36 nextGroup = temp;

			ListNode36 prev = null;
			ListNode36 node = curr;

			while (node != nextGroup) {
				ListNode36 next = node.next;
				node.next = prev;
				prev = node;
				node = next;
			}

			prevTail.next = prev;
			curr.next = nextGroup;

			prevTail = curr;
			curr = nextGroup;
		}

		return dummy.next;
	}

	static void printList(ListNode36 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ListNode36 head = null, tail = null;

		for (int i = 0; i < n; i++) {
			ListNode36 node = new ListNode36(sc.nextInt());

			if (head == null) {
				head = tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
		}

		head = reversePattern(head);

		System.out.println("Linked List after reversing in chunks of 2,3,4 pattern:");
		printList(head);
	}
}
