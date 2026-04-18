package my.collection.linkedlist.practice;

class Node51 {
	int data;
	Node51 next;

	Node51(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex106 {

	static int convertToDecimal(Node51 head) {
		int result = 0;

		Node51 temp = head;
		while (temp != null) {
			result = result * 2 + temp.data;
			temp = temp.next;
		}

		return result;
	}

	public static void main(String[] args) {
		Node51 head = new Node51(1);
		head.next = new Node51(0);
		head.next.next = new Node51(1);

		System.out.println(convertToDecimal(head));
	}
}