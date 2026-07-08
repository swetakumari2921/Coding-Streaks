package my.collection.linkedlist.practice;

class ListNode56 {
	int data;
	ListNode56 next;

	ListNode56(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex192 {

	static ListNode56 insert(ListNode56 head, int data) {
		ListNode56 newNode = new ListNode56(data);

		if (head == null) {
			return newNode;
		}

		ListNode56 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		return head;
	}

	static ListNode56 reverse(ListNode56 head) {
		ListNode56 prev = null;
		ListNode56 curr = head;

		while (curr != null) {
			ListNode56 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static boolean isPalindrome(ListNode56 head) {

		if (head == null || head.next == null) {
			return true;
		}

		// Find the middle of the linked list
		ListNode56 slow = head;
		ListNode56 fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// Reverse the second half
		ListNode56 secondHalf = reverse(slow.next);

		// Compare both halves
		ListNode56 firstHalf = head;
		ListNode56 temp = secondHalf;

		while (temp != null) {
			if (firstHalf.data != temp.data) {
				slow.next = reverse(secondHalf); // Restore before returning
				return false;
			}
			firstHalf = firstHalf.next;
			temp = temp.next;
		}

		// Restore the original list
		slow.next = reverse(secondHalf);

		return true;
	}

	static void display(ListNode56 head) {
		ListNode56 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode56 head = null;

		head = insert(head, 1);
		head = insert(head, 2);
		head = insert(head, 3);
		head = insert(head, 2);
		head = insert(head, 1);

		System.out.print("LinkedList: ");
		display(head);

		if (isPalindrome(head)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		System.out.print("LinkedList after check: ");
		display(head);
	}
}
