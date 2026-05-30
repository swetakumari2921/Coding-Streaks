package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode24 {
	int data;
	ListNode24 next;

	ListNode24(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ListNode24 head = null;
		ListNode24 tail = null;

		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {

			int value = sc.nextInt();
			ListNode24 newNode = new ListNode24(value);

			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		int count = 0;
		ListNode24 temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		temp = head;

		if (count % 2 == 1) {

			for (int i = 0; i < count / 2; i++) {
				temp = temp.next;
			}

			System.out.println("Median: " + temp.data);

		} else {

			for (int i = 0; i < count / 2 - 1; i++) {
				temp = temp.next;
			}

			double median = (temp.data + temp.next.data) / 2.0;

			System.out.println("Median: " + median);
		}

		sc.close();
	}
}
