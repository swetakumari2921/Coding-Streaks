package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex114 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(-1);
		list.add(5);

		int target = 6;

		Collections.sort(list);

		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			int sum = list.get(left) + list.get(right);

			if (sum == target) {
				System.out.println(list.get(left) + " " + list.get(right));
				left++;
				right--;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
	}
}
