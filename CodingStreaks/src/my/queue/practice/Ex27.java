package my.queue.practice;

import java.util.*;

class TreeNode4 {
	int data;
	TreeNode4 left;
	TreeNode4 right;

	TreeNode4(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class Ex27 {

	public static ArrayList<Integer> leftView(TreeNode4 root) {

		ArrayList<Integer> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<TreeNode4> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				TreeNode4 current = queue.poll();

				// First node of each level
				if (i == 0) {
					result.add(current.data);
				}

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		TreeNode4 root = new TreeNode4(1);

		root.left = new TreeNode4(2);
		root.right = new TreeNode4(3);

		root.left.left = new TreeNode4(4);
		root.left.right = new TreeNode4(5);

		root.right.left = new TreeNode4(6);

		ArrayList<Integer> ans = leftView(root);

		System.out.println("Left View: " + ans);
	}
}
