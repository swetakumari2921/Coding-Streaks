package my.collection.linkedlist.practice;

class ListNode15 {
	int data;
	ListNode15 next;

	ListNode15(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex143 {

	// Function to insert node at end
	public static ListNode15 insert(ListNode15 head, int data) {

		ListNode15 newNode = new ListNode15(data);

		if (head == null) {
			return newNode;
		}

		ListNode15 temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;

		return head;
	}

	// Function to find first non-repeating element
	public static void firstNonRepeating(ListNode15 head) {

		ListNode15 temp1 = head;

		while (temp1 != null) {

			int count = 0;

			ListNode15 temp2 = head;

			while (temp2 != null) {

				if (temp1.data == temp2.data) {
					count++;
				}

				temp2 = temp2.next;
			}

			if (count == 1) {
				System.out.println("First Non-Repeating Element: " + temp1.data);
				return;
			}

			temp1 = temp1.next;
		}

		System.out.println("No Non-Repeating Element Found");
	}

	public static void main(String[] args) {

		ListNode15 head = null;

		head = insert(head, 4);
		head = insert(head, 5);
		head = insert(head, 1);
		head = insert(head, 2);
		head = insert(head, 1);
		head = insert(head, 4);

		firstNonRepeating(head);
	}
}
