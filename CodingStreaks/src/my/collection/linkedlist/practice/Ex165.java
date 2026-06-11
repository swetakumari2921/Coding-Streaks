package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex165 {

	public static int xorOfNodes(LinkedList<Integer> list) {
		int xor = 0;

		for (int value : list) {
			xor ^= value;
		}

		return xor;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(5);
		list.add(3);
		list.add(7);
		list.add(2);

		System.out.println("XOR of all nodes: " + xorOfNodes(list));
	}
}
