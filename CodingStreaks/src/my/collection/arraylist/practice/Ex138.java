package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex138 {

	public static void reverseSublist(ArrayList<Integer> list, int left, int right) {

		while (left < right) {

			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);

			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		int left = 1;
		int right = 4;

		reverseSublist(list, left, right);

		System.out.println("Updated ArrayList: " + list);
	}
}
