package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node13 {
	int data;
	Node13 next;

	Node13(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex61 {

	public static Node13 addTwoNumbers(Node13 l1, Node13 l2) {

		Node13 dummy = new Node13(0);
		Node13 temp = dummy;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {

			int sum = carry;

			if (l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}

			carry = sum / 10;
			temp.next = new Node13(sum % 10);
			temp = temp.next;
		}

		return dummy.next;
	}

	public static void printList(Node13 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes for first list:");
		int n1 = sc.nextInt();

		Node13 head1 = null, tail1 = null;
		System.out.println("Enter elements:");
		for (int i = 0; i < n1; i++) {
			int val = sc.nextInt();
			Node13 newNode = new Node13(val);

			if (head1 == null) {
				head1 = newNode;
				tail1 = newNode;
			} else {
				tail1.next = newNode;
				tail1 = newNode;
			}
		}

		System.out.println("Enter number of nodes for second list:");
		int n2 = sc.nextInt();

		Node13 head2 = null, tail2 = null;
		System.out.println("Enter elements:");
		for (int i = 0; i < n2; i++) {
			int val = sc.nextInt();
			Node13 newNode = new Node13(val);

			if (head2 == null) {
				head2 = newNode;
				tail2 = newNode;
			} else {
				tail2.next = newNode;
				tail2 = newNode;
			}
		}

		Node13 result = addTwoNumbers(head1, head2);

		System.out.println("Result LinkedList:");
		printList(result);
	}
}