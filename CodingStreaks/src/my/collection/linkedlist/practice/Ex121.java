package my.collection.linkedlist.practice;

class Node65 {
	int data;
	Node65 next;

	Node65(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex121 {

	static int getLength(Node65 head) {
		int count = 0;
		Node65 temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	static Node65[] splitList(Node65 head, int k) {

		Node65[] res = new Node65[k];

		int n = getLength(head);

		int base = n / k;
		int extra = n % k;

		Node65 curr = head;

		for (int i = 0; i < k; i++) {

			Node65 partHead = curr;
			int size = base + (extra > 0 ? 1 : 0);
			extra--;

			Node65 prev = null;

			for (int j = 0; j < size; j++) {
				prev = curr;
				if (curr != null)
					curr = curr.next;
			}

			if (prev != null)
				prev.next = null;

			res[i] = partHead;
		}

		return res;
	}

	static void print(Node65 head) {
		Node65 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Node65 head = new Node65(1);
		head.next = new Node65(2);
		head.next.next = new Node65(3);
		head.next.next.next = new Node65(4);
		head.next.next.next.next = new Node65(5);
		head.next.next.next.next.next = new Node65(6);
		head.next.next.next.next.next.next = new Node65(7);

		int k = 3;

		Node65[] parts = splitList(head, k);

		for (int i = 0; i < k; i++) {
			print(parts[i]);
		}
	}
}
