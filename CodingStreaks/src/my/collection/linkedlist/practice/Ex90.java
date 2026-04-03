package my.collection.linkedlist.practice;

class node39 {
	int data;
	node39 next;

	node39(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex90 {
	static node39 head;

	public static void main(String[] args) {
		head = new node39(10);
		head.next = new node39(20);
		head.next.next = new node39(30);
		head.next.next.next = new node39(40);

		swap(20, 40);
		print();
	}

	static void swap(int x, int y) {
		if (x == y)
			return;

		node39 prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		node39 prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		if (currX == null || currY == null)
			return;

		if (prevX != null)
			prevX.next = currY;
		else
			head = currY;

		if (prevY != null)
			prevY.next = currX;
		else
			head = currX;

		node39 temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	static void print() {
		node39 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
