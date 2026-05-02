package my.collection.linkedlist.practice;

class Node64 {
	int data;
	Node64 next;

	Node64(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex120 {

	static Node64 reverse(Node64 head) {
		Node64 prev = null;
		Node64 curr = head;

		while (curr != null) {
			Node64 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static Node64 findMiddle(Node64 head) {
		Node64 slow = head;
		Node64 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	static int maxTwinSum(Node64 head) {

		Node64 mid = findMiddle(head);

		Node64 second = reverse(mid);
		Node64 first = head;

		int max = 0;

		while (second != null) {
			int sum = first.data + second.data;
			if (sum > max) {
				max = sum;
			}
			first = first.next;
			second = second.next;
		}

		return max;
	}

	public static void main(String[] args) {

		Node64 head = new Node64(1);
		head.next = new Node64(2);
		head.next.next = new Node64(3);
		head.next.next.next = new Node64(4);

		System.out.println(maxTwinSum(head));
	}
}
