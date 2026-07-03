package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex195 {

	static int findMissingNumber(ArrayList<Integer> list, int n) {

		boolean[] present = new boolean[n + 1];

		for (int num : list) {
			if (num >= 1 && num <= n) {
				present[num] = true;
			}
		}

		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				return i;
			}
		}

		return -1; // No missing number
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(6);

		int n = 6;

		int missing = findMissingNumber(list, n);

		if (missing != -1) {
			System.out.println("Missing Number = " + missing);
		} else {
			System.out.println("No Missing Number");
		}
	}
}
