package my.collection.linkedlist.practice;

class Node56 {
	int data;
	Node56 next;

	Node56(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex112 {

	static int getLength(Node56 head, int k) {
		int count = 0;
		Node56 temp = head;

		while (temp != null && count < k) {
			temp = temp.next;
			count++;
		}

		return count;
	}

	static Node56 reverseEvenGroups(Node56 head) {

		Node56 dummy = new Node56(0);
		dummy.next = head;

		Node56 prevGroupEnd = dummy;
		Node56 curr = head;

		int groupSize = 1;

		while (curr != null) {

			int len = getLength(curr, groupSize);

			Node56 groupStart = curr;
			Node56 temp = curr;

			if (len % 2 == 0) {

				Node56 prev = null;

				for (int i = 0; i < len; i++) {
					Node56 next = temp.next;
					temp.next = prev;
					prev = temp;
					temp = next;
				}

				prevGroupEnd.next = prev;
				groupStart.next = temp;
				prevGroupEnd = groupStart;
				curr = temp;

			} else {

				for (int i = 0; i < len; i++) {
					prevGroupEnd = curr;
					curr = curr.next;
				}
			}

			groupSize++;
		}

		return dummy.next;
	}

	static void print(Node56 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node56 head = new Node56(1);
		head.next = new Node56(2);
		head.next.next = new Node56(3);
		head.next.next.next = new Node56(4);
		head.next.next.next.next = new Node56(5);
		head.next.next.next.next.next = new Node56(6);
		head.next.next.next.next.next.next = new Node56(7);
		head.next.next.next.next.next.next.next = new Node56(8);

		head = reverseEvenGroups(head);

		print(head);
	}
}