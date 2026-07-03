package my.collection.linkedlist.practice;

class ListNode52 {
	int data;
	ListNode52 next;

	ListNode52(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex187 {

	static void splitOddEven(ListNode52 head) {

		ListNode52 oddHead = null, oddTail = null;
		ListNode52 evenHead = null, evenTail = null;

		int index = 1;
		ListNode52 temp = head;

		while (temp != null) {

			ListNode52 newNode = new ListNode52(temp.data);

			if (index % 2 == 1) {
				if (oddHead == null) {
					oddHead = oddTail = newNode;
				} else {
					oddTail.next = newNode;
					oddTail = newNode;
				}
			} else {
				if (evenHead == null) {
					evenHead = evenTail = newNode;
				} else {
					evenTail.next = newNode;
					evenTail = newNode;
				}
			}

			temp = temp.next;
			index++;
		}

		System.out.print("Odd Index List: ");
		printList(oddHead);

		System.out.print("Even Index List: ");
		printList(evenHead);
	}

	static void printList(ListNode52 head) {
		ListNode52 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		ListNode52 head = new ListNode52(10);
		head.next = new ListNode52(20);
		head.next.next = new ListNode52(30);
		head.next.next.next = new ListNode52(40);
		head.next.next.next.next = new ListNode52(50);
		head.next.next.next.next.next = new ListNode52(60);

		splitOddEven(head);
	}
}
