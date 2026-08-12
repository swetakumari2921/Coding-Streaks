package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex42 {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	private TreeNode root;

	// Insert node level by level
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

	// Multi-level BFS traversal
	public void bfs() {

		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		int level = 1;

		while (!queue.isEmpty()) {

			int size = queue.size();

			System.out.print("Level " + level + ": ");

			for (int i = 0; i < size; i++) {

				TreeNode current = queue.poll();

				System.out.print(current.data + " ");

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
			}

			System.out.println();

			level++;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex42 tree = new Ex42();

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			tree.insert(sc.nextInt());
		}

		System.out.println("\nMulti-Level BFS Traversal:");

		tree.bfs();

		sc.close();
	}
}
