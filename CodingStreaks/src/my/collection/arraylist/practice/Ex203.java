package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex203 {

	// Returns sum of elements from left to right (inclusive)
	static int rangeSum(ArrayList<Integer> list, int left, int right) {
		if (left < 0 || right >= list.size() || left > right) {
			System.out.println("Invalid Range");
			return -1;
		}

		int sum = 0;
		for (int i = left; i <= right; i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		int left = 1;
		int right = 3;

		System.out.println("ArrayList: " + list);
		System.out.println("Range Sum (" + left + ", " + right + ") = " + rangeSum(list, left, right));
	}
}
