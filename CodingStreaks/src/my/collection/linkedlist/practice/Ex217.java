package my.collection.linkedlist.practice;

class ListNode82 {
	int data;
	ListNode82 next;

	ListNode82(int data) {
		this.data = data;
	}
}

public class Ex217 {

	static int countCommon(ListNode82 left, ListNode82 right) {
		int count = 0;

		while (left != null && right != null) {
			if (left.data != right.data)
				break;

			count++;
			left = left.next;
			right = right.next;
		}

		return count;
	}

	static int longestPalindrome(ListNode82 head) {
		ListNode82 prev = null;
		ListNode82 curr = head;
		int maxLength = 0;

		while (curr != null) {
			ListNode82 next = curr.next;

			// Reverse current node
			curr.next = prev;

			// Even length palindrome
			maxLength = Math.max(maxLength, 2 * countCommon(prev, next));

			// Odd length palindrome
			maxLength = Math.max(maxLength, 2 * countCommon(curr, next) + 1);

			prev = curr;
			curr = next;
		}

		return maxLength;
	}

	public static void main(String[] args) {

		ListNode82 head = new ListNode82(2);
		head.next = new ListNode82(3);
		head.next.next = new ListNode82(7);
		head.next.next.next = new ListNode82(3);
		head.next.next.next.next = new ListNode82(2);
		head.next.next.next.next.next = new ListNode82(12);
		head.next.next.next.next.next.next = new ListNode82(24);

		System.out.println("Length of Longest Palindromic Sub-LinkedList: " + longestPalindrome(head));
	}
}
