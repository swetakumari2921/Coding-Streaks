package my.collection.linkedlist.practice;

import java.util.Scanner;

class Node4 {
	int data;
	Node4 next;

	Node4(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of first list: ");
		int n1 = sc.nextInt();
		Node4 head1 = null, tail1 = null;
		System.out.println("Enter elements of first list:");
		for (int i = 0; i < n1; i++) {
			int val = sc.nextInt();
			Node4 newNode = new Node4(val);
			if (head1 == null) {
				head1 = newNode;
				tail1 = newNode;
			} else {
				tail1.next = newNode;
				tail1 = newNode;
			}
		}

		System.out.print("Enter size of second list: ");
		int n2 = sc.nextInt();
		Node4 head2 = null, tail2 = null;
		System.out.println("Enter elements of second list:");
		for (int i = 0; i < n2; i++) {
			int val = sc.nextInt();
			Node4 newNode = new Node4(val);
			if (head2 == null) {
				head2 = newNode;
				tail2 = newNode;
			} else {
				tail2.next = newNode;
				tail2 = newNode;
			}
		}

		Node4 curr1 = head1, curr2 = head2;
		while (curr1 != null && curr2 != null) {
			Node4 next1 = curr1.next;
			Node4 next2 = curr2.next;
			curr1.next = curr2;
			curr2.next = next1;
			curr1 = next1;
			curr2 = next2;
		}

		if (curr1 == null && curr2 != null) {
			tail1.next = curr2;
		}

		Node4 temp = head1;
		System.out.println("Merged list:");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
