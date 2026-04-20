package my.arrays.practice;

import java.util.ArrayList;

public class Ex127 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(10);

		int target = 6;
		int floor = -1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) <= target) {
				floor = list.get(i);
			} else {
				break;
			}
		}

		System.out.println(floor);
	}
}
