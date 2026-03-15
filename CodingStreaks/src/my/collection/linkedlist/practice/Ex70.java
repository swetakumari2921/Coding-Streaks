package my.collection.linkedlist.practice;

class node21 {
	int data;
	node21 next;

	node21(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex70 {

	public static void main(String[] args) {

		node21 head = new node21(1);
		head.next = new node21(2);
		head.next.next = new node21(3);
		head.next.next.next = new node21(4);
		head.next.next.next.next = new node21(5);

		head.next.next.next.next.next = head.next.next; // loop

		System.out.println("Length of loop: " + countLoopLength(head));
	}

	public static int countLoopLength(node21 head) {

		node21 slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				int count = 1;
				node21 temp = slow;
				while (temp.next != slow) {
					temp = temp.next;
					count++;
				}
				return count;
			}
		}

		return 0;
	}
}