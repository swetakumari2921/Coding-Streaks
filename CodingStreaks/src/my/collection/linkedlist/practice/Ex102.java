package my.collection.linkedlist.practice;

public class Ex102 {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	public static Node reorder(Node head) {
		if (head == null || head.next == null)
			return head;

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node second = slow.next;
		slow.next = null;

		second = reverse(second);

		Node first = head;

		while (second != null) {
			Node temp1 = first.next;
			Node temp2 = second.next;

			first.next = second;
			second.next = temp1;

			first = temp1;
			second = temp2;
		}

		return head;
	}

	public static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		head = reorder(head);
		print(head);
	}
}
