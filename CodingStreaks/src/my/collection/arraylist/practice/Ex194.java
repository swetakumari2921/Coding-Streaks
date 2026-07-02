package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex194 {

	static int findKthMissing(ArrayList<Integer> list, int k) {
		int missingCount = 0;
		int current = 1;
		int i = 0;

		while (true) {
			if (i < list.size() && list.get(i) == current) {
				i++;
			} else {
				missingCount++;
				if (missingCount == k) {
					return current;
				}
			}
			current++;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(11);

		int k = 5;

		System.out.println("ArrayList: " + list);
		System.out.println(k + "th Missing Positive Number: " + findKthMissing(list, k));
	}
}
