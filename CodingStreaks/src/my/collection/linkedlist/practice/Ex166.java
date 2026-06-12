package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode35 {
	int val;
	ListNode35 next;

	ListNode35(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex166 {

	static ListNode35 head = null;

	static void insert(int val) {
		ListNode35 newNode = new ListNode35(val);

		if (head == null) {
			head = newNode;
		} else {
			ListNode35 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	static int findXOR(ListNode35 head) {
		int xor = 0;

		ListNode35 temp = head;
		while (temp != null) {
			xor = xor ^ temp.val;
			temp = temp.next;
		}

		return xor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			insert(sc.nextInt());
		}

		int xor = findXOR(head);

		if (xor == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}
