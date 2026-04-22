package my.collection.linkedlist.practice;

class Node54 {
	int data;
	Node54 next;

	Node54(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex110 {

	static long toNumber(Node54 head) {
		long num = 0;
		while (head != null) {
			num = num * 10 + head.data;
			head = head.next;
		}
		return num;
	}

	static Node54 createList(long num) {
		if (num == 0)
			return new Node54(0);

		Node54 head = null;

		while (num > 0) {
			Node54 newNode = new Node54((int) (num % 10));
			newNode.next = head;
			head = newNode;
			num = num / 10;
		}

		return head;
	}

	public static void main(String[] args) {
		Node54 l1 = new Node54(1);
		l1.next = new Node54(2);
		l1.next.next = new Node54(3);

		Node54 l2 = new Node54(4);
		l2.next = new Node54(5);

		long num1 = toNumber(l1);
		long num2 = toNumber(l2);

		long product = num1 * num2;

		Node54 result = createList(product);

		while (result != null) {
			System.out.print(result.data);
			result = result.next;
		}
	}
}
