package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex106 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);

		int k = 3;
		int maxSum = 0, windowSum = 0;

		for (int i = 0; i < k; i++) {
			windowSum += list.get(i);
		}

		maxSum = windowSum;

		for (int i = k; i < list.size(); i++) {
			windowSum += list.get(i);
			windowSum -= list.get(i - k);
			maxSum = Math.max(maxSum, windowSum);
		}

		System.out.println(maxSum);
	}
}
