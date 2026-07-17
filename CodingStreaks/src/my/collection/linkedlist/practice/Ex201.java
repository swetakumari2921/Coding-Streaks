package my.collection.linkedlist.practice;

class ListNode67 {
	int data;
	ListNode67 next;
	ListNode67 random;

	ListNode67(int data) {
		this.data = data;
	}
}

public class Ex201 {

	public static ListNode67 cloneList(ListNode67 head) {
		if (head == null)
			return null;

		// Step 1: Insert cloned nodes
		ListNode67 curr = head;

		while (curr != null) {
			ListNode67 copy = new ListNode67(curr.data);
			copy.next = curr.next;
			curr.next = copy;
			curr = copy.next;
		}

		// Step 2: Copy random pointers
		curr = head;

		while (curr != null) {
			if (curr.random != null)
				curr.next.random = curr.random.next;

			curr = curr.next.next;
		}

		// Step 3: Separate both lists
		curr = head;
		ListNode67 cloneHead = head.next;

		while (curr != null) {
			ListNode67 copy = curr.next;

			curr.next = copy.next;

			if (copy.next != null)
				copy.next = copy.next.next;

			curr = curr.next;
		}

		return cloneHead;
	}

	public static void printList(ListNode67 head) {
		while (head != null) {
			int randomValue = (head.random != null) ? head.random.data : -1;

			System.out.println("Node = " + head.data + ", Random = " + randomValue);

			head = head.next;
		}
	}

	public static void main(String[] args) {

		ListNode67 n1 = new ListNode67(1);
		ListNode67 n2 = new ListNode67(2);
		ListNode67 n3 = new ListNode67(3);
		ListNode67 n4 = new ListNode67(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		n1.random = n3;
		n2.random = n1;
		n3.random = n4;
		n4.random = n2;

		ListNode67 cloned = cloneList(n1);

		System.out.println("Original List:");
		printList(n1);

		System.out.println("\nCloned List:");
		printList(cloned);
	}
}
