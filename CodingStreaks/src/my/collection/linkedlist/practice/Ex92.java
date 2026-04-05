package my.collection.linkedlist.practice;

public class Ex92 {
	int data;
	Ex92 next;

	Ex92(int data) {
		this.data = data;
		this.next = null;
	}

	public static void main(String[] args) {
		Ex92 head = new Ex92(1);
		head.next = new Ex92(2);
		head.next.next = new Ex92(3);
		head.next.next.next = new Ex92(4);

		Ex92 temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		Ex92 first = head;
		head = head.next;
		first.next = null;
		temp.next = first;

		Ex92 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
