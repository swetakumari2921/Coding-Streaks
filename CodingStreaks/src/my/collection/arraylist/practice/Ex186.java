package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex186 {

	public static int floorSqrt(ArrayList<Integer> list, int x) {
		int low = 0;
		int high = list.size() - 1;
		int ans = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			long square = (long) list.get(mid) * list.get(mid);

			if (square == x) {
				return list.get(mid);
			} else if (square < x) {
				ans = list.get(mid);
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int x = 20;

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= x; i++) {
			list.add(i);
		}

		System.out.println(floorSqrt(list, x));
	}
}
