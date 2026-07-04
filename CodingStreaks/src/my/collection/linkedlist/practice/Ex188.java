package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex188 {

	static int longestIncreasingSublist(LinkedList<Integer> list) {

		if (list.isEmpty())
			return 0;

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 1; i < list.size(); i++) {

			if (list.get(i) > list.get(i - 1)) {
				currentLength++;
			} else {
				currentLength = 1;
			}

			if (currentLength > maxLength) {
				maxLength = currentLength;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(1);

		System.out.println("LinkedList: " + list);

		int ans = longestIncreasingSublist(list);

		System.out.println("Length of Longest Increasing Sublist: " + ans);
	}
}
