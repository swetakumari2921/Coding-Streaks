package my.collection.linkedlist.practice;

class Node57 {
	int data;
	Node57 next, bottom;

	Node57(int data) {
		this.data = data;
		next = bottom = null;
	}
}

public class Ex113 {

	static Node57 merge(Node57 a, Node57 b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		Node57 result;

		if (a.data < b.data) {
			result = a;
			result.bottom = merge(a.bottom, b);
		} else {
			result = b;
			result.bottom = merge(a, b.bottom);
		}

		result.next = null;
		return result;
	}

	static Node57 flatten(Node57 root) {
		if (root == null || root.next == null)
			return root;

		root.next = flatten(root.next);
		root = merge(root, root.next);

		return root;
	}

	static void print(Node57 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.bottom;
		}
	}

	public static void main(String[] args) {
		Node57 head = new Node57(5);
		head.bottom = new Node57(7);
		head.bottom.bottom = new Node57(8);
		head.bottom.bottom.bottom = new Node57(30);

		head.next = new Node57(10);
		head.next.bottom = new Node57(20);

		head.next.next = new Node57(19);
		head.next.next.bottom = new Node57(22);
		head.next.next.bottom.bottom = new Node57(50);

		head.next.next.next = new Node57(28);
		head.next.next.next.bottom = new Node57(35);
		head.next.next.next.bottom.bottom = new Node57(40);
		head.next.next.next.bottom.bottom.bottom = new Node57(45);

		Node57 result = flatten(head);
		print(result);
	}
}
