package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex178 {

	public static int floorCubeRoot(LinkedList<Integer> list, int x) {
		int ans = 0;

		for (int i = 0; i < list.size(); i++) {
			long cube = (long) list.get(i) * list.get(i) * list.get(i);

			if (cube <= x) {
				ans = list.get(i);
			} else {
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int x = 30;

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i <= x; i++) {
			list.add(i);
		}

		System.out.println(floorCubeRoot(list, x));
	}
}
