package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex144 {

	public static int countSmallerThanMedian(ArrayList<Integer> list) {

		ArrayList<Integer> temp = new ArrayList<>(list);

		Collections.sort(temp);

		double median;

		int n = temp.size();

		if (n % 2 == 0) {
			median = (temp.get(n / 2 - 1) + temp.get(n / 2)) / 2.0;
		} else {
			median = temp.get(n / 2);
		}

		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < median) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(9);

		int result = countSmallerThanMedian(list);

		System.out.println("Count = " + result);
	}
}
