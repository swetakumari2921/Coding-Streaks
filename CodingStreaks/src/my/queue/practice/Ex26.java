package my.queue.practice;

import java.util.*;

class TreeNode3 {
	int data;
	TreeNode3 left;
	TreeNode3 right;

	TreeNode3(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Ex26 {

	public static void rightView(TreeNode3 root) {

		if (root == null) {
			return;
		}

		Queue<TreeNode3> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				TreeNode3 current = queue.poll();

				// Last node of each level gives right view
				if (i == size - 1) {
					System.out.print(current.data + " ");
				}

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}
	}

	public static void main(String[] args) {

		TreeNode3 root = new TreeNode3(1);

		root.left = new TreeNode3(2);
		root.right = new TreeNode3(3);

		root.left.left = new TreeNode3(4);
		root.left.right = new TreeNode3(5);

		root.right.right = new TreeNode3(6);

		System.out.print("Right View: ");
		rightView(root);
	}
}
