package my.collection.linkedlist.practice;

class ListNode62 {
	int data;
	ListNode62 next;

	ListNode62(int data) {
		this.data = data;
		this.next = null;
	}
}

class TreeNode2 {
	int data;
	TreeNode2 left;
	TreeNode2 right;

	TreeNode2(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Ex198 {

	static TreeNode2 sortedListToBST(ListNode62 head) {

		if (head == null)
			return null;

		if (head.next == null)
			return new TreeNode2(head.data);

		ListNode62 prev = null;
		ListNode62 slow = head;
		ListNode62 fast = head;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if (prev != null)
			prev.next = null;

		TreeNode2 root = new TreeNode2(slow.data);

		if (head != slow)
			root.left = sortedListToBST(head);

		root.right = sortedListToBST(slow.next);

		return root;
	}

	static void inorder(TreeNode2 root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {

		ListNode62 head = new ListNode62(1);
		head.next = new ListNode62(2);
		head.next.next = new ListNode62(3);
		head.next.next.next = new ListNode62(4);
		head.next.next.next.next = new ListNode62(5);
		head.next.next.next.next.next = new ListNode62(6);
		head.next.next.next.next.next.next = new ListNode62(7);

		TreeNode2 root = sortedListToBST(head);

		System.out.println("Inorder Traversal of Balanced BST:");
		inorder(root);
	}
}
