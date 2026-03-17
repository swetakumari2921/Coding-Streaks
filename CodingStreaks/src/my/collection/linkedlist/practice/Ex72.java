package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex72 {
	public static boolean isCircular(LinkedList<Integer> list) {
		if (list.isEmpty())
			return false;

		int slow = 0;
		int fast = 0;

		while (true) {
			slow = (slow + 1) % list.size();
			fast = (fast + 2) % list.size();

			if (slow == fast)
				return true;
			if (slow == 0 || fast == 0)
				return false;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		boolean circular = isCircular(list);
		System.out.println("Is LinkedList circular? " + circular);
	}
}
