package my.collection.linkedlist.practice;

class Node52 {
	int data;
	Node52 next;

	Node52(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex107 {

	static Node52 reverse(Node52 head) {
		Node52 prev = null;
		Node52 curr = head;

		while (curr != null) {
			Node52 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static Node52 addOne(Node52 head) {
		head = reverse(head);

		Node52 curr = head;
		int carry = 1;

		while (curr != null) {
			int sum = curr.data + carry;
			curr.data = sum % 10;
			carry = sum / 10;

			if (carry == 0)
				break;

			if (curr.next == null && carry > 0) {
				curr.next = new Node52(carry);
				break;
			}

			curr = curr.next;
		}

		return reverse(head);
	}

	static void print(Node52 head) {
		Node52 temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node52 head = new Node52(9);
		head.next = new Node52(9);
		head.next.next = new Node52(9);

		head = addOne(head);
		print(head);
	}
}
