package my.collection.arraylist.practice;

import java.util.Scanner;

class Node3 {
	int data;
	Node3 next;

	Node3(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of first list: ");
		int n1 = sc.nextInt();
		Node3 head1 = null, tail1 = null;
		System.out.println("Enter elements of first list:");
		for (int i = 0; i < n1; i++) {
			int val = sc.nextInt();
			Node3 newNode = new Node3(val);
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
		Node3 head2 = null, tail2 = null;
		System.out.println("Enter elements of second list:");
		for (int i = 0; i < n2; i++) {
			int val = sc.nextInt();
			Node3 newNode = new Node3(val);
			if (head2 == null) {
				head2 = newNode;
				tail2 = newNode;
			} else {
				tail2.next = newNode;
				tail2 = newNode;
			}
		}

		Node3 curr1 = head1, curr2 = head2;
		while (curr1 != null && curr2 != null) {
			Node3 next1 = curr1.next;
			Node3 next2 = curr2.next;
			curr1.next = curr2;
			curr2.next = next1;
			curr1 = next1;
			curr2 = next2;
		}

		Node3 mergedHead = head1;
		if (curr1 == null && curr2 != null) {
			tail1.next = curr2;
		}

		Node3 temp = mergedHead;
		System.out.println("Merged list:");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
