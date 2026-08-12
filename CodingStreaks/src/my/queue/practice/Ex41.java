package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex41 {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	private TreeNode root;

	// Insert node
	public void insert(int data) {
		TreeNode newNode = new TreeNode(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();

			if (current.left == null) {
				current.left = newNode;
				return;
			} else {
				queue.add(current.left);
			}

			if (current.right == null) {
				current.right = newNode;
				return;
			} else {
				queue.add(current.right);
			}
		}
	}

	// Spiral level order traversal
	public void spiralOrder() {

		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		boolean leftToRight = true;

		while (!queue.isEmpty()) {

			int size = queue.size();

			int[] level = new int[size];

			for (int i = 0; i < size; i++) {

				TreeNode current = queue.poll();

				int index;

				if (leftToRight) {
					index = i;
				} else {
					index = size - 1 - i;
				}

				level[index] = current.data;

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
			}

			for (int value : level) {
				System.out.print(value + " ");
			}

			leftToRight = !leftToRight;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex41 tree = new Ex41();

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			tree.insert(sc.nextInt());
		}

		System.out.println("Spiral Level Order:");

		tree.spiralOrder();

		sc.close();
	}
}
