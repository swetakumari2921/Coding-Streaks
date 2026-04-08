package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex101 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(2);

		int totalSum = 0;
		for (int x : list)
			totalSum += x;

		int leftSum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (leftSum == totalSum - leftSum - list.get(i)) {
				System.out.println(i);
				return;
			}
			leftSum += list.get(i);
		}

		System.out.println(-1);
	}
}
