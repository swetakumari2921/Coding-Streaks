package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex143 {

	public static int countGreaterThanAverage(ArrayList<Integer> list) {

		int sum = 0;

		// Calculate sum
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		double average = (double) sum / list.size();

		int count = 0;

		// Count numbers greater than average
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > average) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		int result = countGreaterThanAverage(list);

		System.out.println("Count = " + result);
	}
}
