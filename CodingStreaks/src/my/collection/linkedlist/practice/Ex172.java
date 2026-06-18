package my.collection.linkedlist.practice;

public class Ex172 {

	static class ListNode40 {
		int data;
		ListNode40 next;

		ListNode40(int data) {
			this.data = data;
		}
	}

	public static ListNode40 insertionSort(ListNode40 head) {
		ListNode40 sorted = null;
		ListNode40 curr = head;

		while (curr != null) {
			ListNode40 next = curr.next;

			// insert into sorted list
			if (sorted == null || curr.data < sorted.data) {
				curr.next = sorted;
				sorted = curr;
			} else {
				ListNode40 temp = sorted;

				while (temp.next != null && temp.next.data < curr.data) {
					temp = temp.next;
				}

				curr.next = temp.next;
				temp.next = curr;
			}

			curr = next;
		}

		return sorted;
	}

	public static void print(ListNode40 head) {
		ListNode40 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode40 head = new ListNode40(7);
		head.next = new ListNode40(3);
		head.next.next = new ListNode40(5);
		head.next.next.next = new ListNode40(1);

		System.out.print("Original: ");
		print(head);

		head = insertionSort(head);

		System.out.print("Sorted: ");
		print(head);
	}
}
