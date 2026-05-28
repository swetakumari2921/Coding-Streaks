package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode22 {

	int data;
	ListNode22 next;

	ListNode22(int data) {
		this.data = data;
	}
}

public class Ex151 {

	public static ListNode22 rotateClockwise(ListNode22 head, int k) {

		if (head == null || k == 0) {
			return head;
		}

		// find length
		int length = 1;
		ListNode22 temp = head;

		while (temp.next != null) {
			temp = temp.next;
			length++;
		}

		// make it circular
		temp.next = head;

		k = k % length;

		int stepsToNewTail = length - k;

		ListNode22 newTail = head;

		for (int i = 1; i < stepsToNewTail; i++) {
			newTail = newTail.next;
		}

		ListNode22 newHead = newTail.next;

		// break circle
		newTail.next = null;

		return newHead;
	}

	public static void printList(ListNode22 head) {

		ListNode22 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		System.out.println("Enter node values:");

		ListNode22 head = null;
		ListNode22 tail = null;

		for (int i = 0; i < n; i++) {

			int val = sc.nextInt();
			ListNode22 newNode = new ListNode22(val);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		System.out.println("Enter K:");
		int k = sc.nextInt();

		head = rotateClockwise(head, k);

		System.out.println("Rotated LinkedList:");
		printList(head);
	}
}
