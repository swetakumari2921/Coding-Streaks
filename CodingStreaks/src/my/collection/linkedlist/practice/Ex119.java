package my.collection.linkedlist.practice;

class Node63 {
	int data;
	Node63 next;

	Node63(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex119 {

	static Node63 getIntersection(Node63 headA, Node63 headB) {
		if (headA == null || headB == null)
			return null;

		Node63 a = headA;
		Node63 b = headB;

		while (a != b) {
			a = (a == null) ? headB : a.next;
			b = (b == null) ? headA : b.next;
		}

		return a;
	}

	public static void main(String[] args) {

		Node63 common = new Node63(8);
		common.next = new Node63(10);

		Node63 headA = new Node63(3);
		headA.next = new Node63(6);
		headA.next.next = new Node63(9);
		headA.next.next.next = common;

		Node63 headB = new Node63(4);
		headB.next = common;

		Node63 result = getIntersection(headA, headB);

		if (result != null)
			System.out.println(result.data);
		else
			System.out.println(-1);
	}
}
