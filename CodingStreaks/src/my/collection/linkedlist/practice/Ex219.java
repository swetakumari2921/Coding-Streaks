package my.collection.linkedlist.practice;

class ListNode84 {
	int data;
	ListNode84 next;

	ListNode84(int data) {
		this.data = data;
	}
}

public class Ex219 {

	// Reverse LinkedList
	public static ListNode84 reverse(ListNode84 head) {
		ListNode84 prev = null;
		ListNode84 current = head;

		while (current != null) {
			ListNode84 next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	// Add two large numbers represented as LinkedLists
	public static ListNode84 addNumbers(ListNode84 l1, ListNode84 l2) {

		l1 = reverse(l1);
		l2 = reverse(l2);

		int carry = 0;
		ListNode84 dummy = new ListNode84(0);
		ListNode84 tail = dummy;

		while (l1 != null || l2 != null || carry != 0) {

			int sum = carry;

			if (l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}

			carry = sum / 10;
			tail.next = new ListNode84(sum % 10);
			tail = tail.next;
		}

		return reverse(dummy.next);
	}

	// Print LinkedList
	public static void printList(ListNode84 head) {
		while (head != null) {
			System.out.print(head.data);
			if (head.next != null) {
				System.out.print(" -> ");
			}
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Number: 9999
		ListNode84 l1 = new ListNode84(9);
		l1.next = new ListNode84(9);
		l1.next.next = new ListNode84(9);
		l1.next.next.next = new ListNode84(9);

		// Number: 1
		ListNode84 l2 = new ListNode84(1);

		System.out.print("First Number : ");
		printList(l1);

		System.out.print("Second Number: ");
		printList(l2);

		ListNode84 result = addNumbers(l1, l2);

		System.out.print("Sum          : ");
		printList(result);
	}
}
