package my.queue.practice;

import java.util.*;

class TreeNode2 {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode2(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Ex25 {

	public static void zigzagTraversal(TreeNode root) {

		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		boolean leftToRight = true;

		while (!queue.isEmpty()) {

			int size = queue.size();

			ArrayList<Integer> level = new ArrayList<>();

			// Process current level
			for (int i = 0; i < size; i++) {

				TreeNode node = queue.poll();

				level.add(node.data);

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

			// Print level in zigzag order
			if (!leftToRight) {
				Collections.reverse(level);
			}

			for (int val : level) {
				System.out.print(val + " ");
			}

			leftToRight = !leftToRight;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println("Zigzag Traversal:");
		zigzagTraversal(root);
	}
}