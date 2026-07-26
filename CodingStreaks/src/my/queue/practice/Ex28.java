package my.queue.practice;

import java.util.*;

class TreeNode5 {
	int data;
	TreeNode5 left, right;

	TreeNode5(int data) {
		this.data = data;
		left = right = null;
	}
}

class Pair {
	TreeNode5 node;
	int hd; // horizontal distance

	Pair(TreeNode5 node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class Ex28 {

	public static ArrayList<Integer> bottomView(TreeNode5 root) {

		ArrayList<Integer> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		TreeMap<Integer, Integer> map = new TreeMap<>();

		Queue<Pair> queue = new LinkedList<>();

		queue.add(new Pair(root, 0));

		while (!queue.isEmpty()) {

			Pair current = queue.poll();

			TreeNode5 node = current.node;
			int hd = current.hd;

			// Update node at this horizontal distance
			map.put(hd, node.data);

			if (node.left != null) {
				queue.add(new Pair(node.left, hd - 1));
			}

			if (node.right != null) {
				queue.add(new Pair(node.right, hd + 1));
			}
		}

		for (int value : map.values()) {
			result.add(value);
		}

		return result;
	}

	public static void main(String[] args) {

		/*
		 * 20 / \ 10 30 / \ \ 5 15 40 \ 18
		 */

		TreeNode5 root = new TreeNode5(20);
		root.left = new TreeNode5(10);
		root.right = new TreeNode5(30);
		root.left.left = new TreeNode5(5);
		root.left.right = new TreeNode5(15);
		root.right.right = new TreeNode5(40);
		root.left.right.right = new TreeNode5(18);

		System.out.println("Bottom View: " + bottomView(root));
	}
}