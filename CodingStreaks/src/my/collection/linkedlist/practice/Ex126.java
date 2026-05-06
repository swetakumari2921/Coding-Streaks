package my.collection.linkedlist.practice;

class ListNode3 {
	int val;
	ListNode3 next;

	ListNode3(int val) {
		this.val = val;
	}
}

public class Ex126 {

	// Merge two sorted linked lists
	static ListNode3 mergeTwo(ListNode3 a, ListNode3 b) {
		ListNode3 dummy = new ListNode3(-1);
		ListNode3 tail = dummy;

		while (a != null && b != null) {
			if (a.val <= b.val) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}

		if (a != null)
			tail.next = a;
		if (b != null)
			tail.next = b;

		return dummy.next;
	}

	// Divide & conquer to merge K lists
	static ListNode3 mergeK(ListNode3[] lists, int start, int end) {
		if (start == end)
			return lists[start];

		int mid = (start + end) / 2;

		ListNode3 left = mergeK(lists, start, mid);
		ListNode3 right = mergeK(lists, mid + 1, end);

		return mergeTwo(left, right);
	}

	// Print list
	static void print(ListNode3 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		// List 1: 1 -> 4 -> 7
		ListNode3 a = new ListNode3(1);
		a.next = new ListNode3(4);
		a.next.next = new ListNode3(7);

		// List 2: 2 -> 5 -> 8
		ListNode3 b = new ListNode3(2);
		b.next = new ListNode3(5);
		b.next.next = new ListNode3(8);

		// List 3: 3 -> 6 -> 9
		ListNode3 c = new ListNode3(3);
		c.next = new ListNode3(6);
		c.next.next = new ListNode3(9);

		ListNode3[] lists = new ListNode3[3];
		lists[0] = a;
		lists[1] = b;
		lists[2] = c;

		ListNode3 result = mergeK(lists, 0, lists.length - 1);

		System.out.print("Merged List: ");
		print(result);
	}
}
