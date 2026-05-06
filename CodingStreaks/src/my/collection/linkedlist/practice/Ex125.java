package my.collection.linkedlist.practice;

class ListNode2 {
	int val;
	ListNode2 next;

	ListNode2(int val) {
		this.val = val;
	}
}

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class Ex125 {

	static ListNode2 current;

	// count nodes in linked list
	static int countNodes(ListNode2 head) {
		int count = 0;
		ListNode2 temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	// build BST using inorder simulation
	static TreeNode buildBST(int n) {
		if (n <= 0)
			return null;

		// left subtree
		TreeNode left = buildBST(n / 2);

		// root node from linked list
		TreeNode root = new TreeNode(current.val);
		root.left = left;

		// move linked list pointer
		current = current.next;

		// right subtree
		root.right = buildBST(n - n / 2 - 1);

		return root;
	}

	// inorder traversal to verify
	static void inorder(TreeNode root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {

		// Sorted LinkedList: -10 -> -3 -> 0 -> 5 -> 9
		ListNode2 head = new ListNode2(-10);
		head.next = new ListNode2(-3);
		head.next.next = new ListNode2(0);
		head.next.next.next = new ListNode2(5);
		head.next.next.next.next = new ListNode2(9);

		current = head;

		int size = countNodes(head);

		TreeNode root = buildBST(size);

		System.out.print("Inorder of BST: ");
		inorder(root);
	}
}
