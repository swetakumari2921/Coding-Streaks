package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex68 {

	public static void productArray(ArrayList<Integer> list) {

		int n = list.size();

		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		left.add(1);
		for (int i = 1; i < n; i++) {
			left.add(left.get(i - 1) * list.get(i - 1));
		}

		right.add(0, 1);
		for (int i = n - 2; i >= 0; i--) {
			right.add(0, right.get(0) * list.get(i + 1));
		}

		for (int i = 0; i < n; i++) {
			result.add(left.get(i) * right.get(i));
		}

		System.out.println(result);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		productArray(list);
	}
}
