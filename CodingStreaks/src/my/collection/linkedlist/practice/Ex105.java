package my.collection.linkedlist.practice;

class node42 {
	int data;
	node42 next;

	node42(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex105 {

	static node42 sortList(node42 head) {
		int c0 = 0, c1 = 0, c2 = 0;

		node42 temp = head;
		while (temp != null) {
			if (temp.data == 0)
				c0++;
			else if (temp.data == 1)
				c1++;
			else
				c2++;
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			if (c0 > 0) {
				temp.data = 0;
				c0--;
			} else if (c1 > 0) {
				temp.data = 1;
				c1--;
			} else {
				temp.data = 2;
				c2--;
			}
			temp = temp.next;
		}

		return head;
	}

	static void print(node42 head) {
		node42 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		node42 head = new node42(2);
		head.next = new node42(1);
		head.next.next = new node42(0);
		head.next.next.next = new node42(1);
		head.next.next.next.next = new node42(2);

		head = sortList(head);
		print(head);
	}
}
