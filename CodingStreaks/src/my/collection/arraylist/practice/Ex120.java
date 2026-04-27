package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex120 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);

		int n = 5;
		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		int total = n * (n + 1) / 2;
		int missing = total - sum;

		System.out.println("Missing Number: " + missing);
	}
}
