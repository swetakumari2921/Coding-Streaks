package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex118 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(0);

		int low = 0, mid = 0, high = list.size() - 1;

		while (mid <= high) {
			if (list.get(mid) == 0) {
				int temp = list.get(low);
				list.set(low, list.get(mid));
				list.set(mid, temp);
				low++;
				mid++;
			} else if (list.get(mid) == 1) {
				mid++;
			} else {
				int temp = list.get(mid);
				list.set(mid, list.get(high));
				list.set(high, temp);
				high--;
			}
		}

		System.out.println(list);
	}
}
