package my.collection.linkedlist.practice;

class ListNode231 {
	int data;
	ListNode231 next;

	ListNode231(int data) {
		this.data = data;
	}
}

public class Ex222 {

	// Insert node at end
	public static ListNode231 insert(ListNode231 head, int data) {
		ListNode231 newNode = new ListNode231(data);

		if (head == null)
			return newNode;

		ListNode231 temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.next = newNode;
		return head;
	}

	// Display LinkedList
	public static void display(ListNode231 head) {
		while (head != null) {
			System.out.print(head.data);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	// Reverse LinkedList
	public static ListNode231 reverse(ListNode231 head) {
		ListNode231 prev = null;
		ListNode231 curr = head;

		while (curr != null) {
			ListNode231 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	// Compare two numbers represented as LinkedLists
	public static int compare(ListNode231 l1, ListNode231 l2) {

		int len1 = 0, len2 = 0;

		ListNode231 t1 = l1, t2 = l2;

		while (t1 != null) {
			len1++;
			t1 = t1.next;
		}

		while (t2 != null) {
			len2++;
			t2 = t2.next;
		}

		if (len1 > len2)
			return 1;
		if (len1 < len2)
			return -1;

		while (l1 != null && l2 != null) {
			if (l1.data > l2.data)
				return 1;
			if (l1.data < l2.data)
				return -1;

			l1 = l1.next;
			l2 = l2.next;
		}

		return 0;
	}

	// Remove leading zeros
	public static ListNode231 removeLeadingZeros(ListNode231 head) {
		while (head != null && head.data == 0 && head.next != null)
			head = head.next;

		return head;
	}

	// Subtract two LinkedList numbers (always positive result)
	public static ListNode231 subtract(ListNode231 l1, ListNode231 l2) {

		if (compare(l1, l2) < 0) {
			ListNode231 temp = l1;
			l1 = l2;
			l2 = temp;
		}

		l1 = reverse(l1);
		l2 = reverse(l2);

		ListNode231 dummy = new ListNode231(0);
		ListNode231 tail = dummy;

		int borrow = 0;

		while (l1 != null) {

			int x = l1.data - borrow;
			int y = (l2 != null) ? l2.data : 0;

			if (x < y) {
				x += 10;
				borrow = 1;
			} else {
				borrow = 0;
			}

			tail.next = new ListNode231(x - y);
			tail = tail.next;

			l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		ListNode231 result = reverse(dummy.next);
		return removeLeadingZeros(result);
	}

	public static void main(String[] args) {

		ListNode231 num1 = null;
		num1 = insert(num1, 9);
		num1 = insert(num1, 8);
		num1 = insert(num1, 7);
		num1 = insert(num1, 6);

		ListNode231 num2 = null;
		num2 = insert(num2, 1);
		num2 = insert(num2, 2);
		num2 = insert(num2, 3);
		num2 = insert(num2, 4);

		System.out.print("Number 1 : ");
		display(num1);

		System.out.print("Number 2 : ");
		display(num2);

		ListNode231 result = subtract(num1, num2);

		System.out.print("Result   : ");
		display(result);
	}
}
