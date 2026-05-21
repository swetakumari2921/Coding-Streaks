package my.collection.linkedlist.practice;

class ListNode16 {
	int data;
	ListNode16 next;

	ListNode16(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex144 {

	// Function to convert array to LinkedList
	public static ListNode16 convertToLinkedList(int[] arr) {

		if (arr.length == 0) {
			return null;
		}

		ListNode16 head = new ListNode16(arr[0]);
		ListNode16 current = head;

		for (int i = 1; i < arr.length; i++) {

			current.next = new ListNode16(arr[i]);
			current = current.next;
		}

		return head;
	}

	// Function to print LinkedList
	public static void printLinkedList(ListNode16 head) {

		ListNode16 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		ListNode16 head = convertToLinkedList(arr);

		System.out.println("LinkedList:");
		printLinkedList(head);
	}
}
