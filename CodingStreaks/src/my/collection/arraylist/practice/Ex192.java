package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex192 {

	public static int smallestMissingPositive(ArrayList<Integer> list) {
		int n = list.size();

		for (int i = 0; i < n; i++) {
			while (list.get(i) > 0 && list.get(i) <= n && list.get(i) != list.get(list.get(i) - 1)) {

				int correctIndex = list.get(i) - 1;

				int temp = list.get(i);
				list.set(i, list.get(correctIndex));
				list.set(correctIndex, temp);
			}
		}

		for (int i = 0; i < n; i++) {
			if (list.get(i) != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(4);
		list.add(-1);
		list.add(1);

		System.out.println("Smallest Missing Positive: " + smallestMissingPositive(list));
	}
}
