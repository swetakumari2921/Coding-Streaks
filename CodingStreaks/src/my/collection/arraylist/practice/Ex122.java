package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex122 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(2);
		arr.add(3);
		arr.add(10);
		arr.add(6);
		arr.add(4);
		arr.add(8);
		arr.add(1);

		int min = arr.get(0);
		int maxDiff = -1;

		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) > min) {
				int diff = arr.get(i) - min;
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
			if (arr.get(i) < min) {
				min = arr.get(i);
			}
		}

		System.out.println("Maximum Difference: " + maxDiff);
	}
}
