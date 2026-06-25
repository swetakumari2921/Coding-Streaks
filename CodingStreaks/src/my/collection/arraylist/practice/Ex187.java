package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex187 {

	static int findCeiling(ArrayList<Integer> list, int x) {
		int left = 0, right = list.size() - 1;
		int ans = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (list.get(mid) >= x) {
				ans = list.get(mid);
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

		System.out.println("Ceiling of each element:");

		for (int i = 0; i < list.size(); i++) {
			int ceiling = findCeiling(list, list.get(i));
			System.out.println(list.get(i) + " -> " + ceiling);
		}
	}
}
