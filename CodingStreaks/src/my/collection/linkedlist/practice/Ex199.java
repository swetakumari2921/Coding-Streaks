package my.collection.linkedlist.practice;

class ListNode63 {
	int data;
	ListNode63 left, right;

	ListNode63(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Ex199 {

	static int diameter = 0;

	static int height(ListNode63 root) {
		if (root == null)
			return 0;

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		diameter = Math.max(diameter, leftHeight + rightHeight);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	static int findDiameter(ListNode63 root) {
		diameter = 0;
		height(root);
		return diameter;
	}

	public static void main(String[] args) {

		ListNode63 root = new ListNode63(1);
		root.left = new ListNode63(2);
		root.right = new ListNode63(3);
		root.left.left = new ListNode63(4);
		root.left.right = new ListNode63(5);

		System.out.println("Diameter = " + findDiameter(root));
	}
}
