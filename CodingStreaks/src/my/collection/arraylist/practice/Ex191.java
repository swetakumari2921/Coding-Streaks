package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex191 {

	public static int firstMissing(ArrayList<Integer> arr) {
		int n = arr.size();

		// Place each positive number at its correct index
		for (int i = 0; i < n; i++) {
			while (arr.get(i) > 0 && arr.get(i) <= n && !arr.get(i).equals(arr.get(arr.get(i) - 1))) {

				int correctIndex = arr.get(i) - 1;

				int temp = arr.get(i);
				arr.set(i, arr.get(correctIndex));
				arr.set(correctIndex, temp);
			}
		}

		// Find the first missing positive number
		for (int i = 0; i < n; i++) {
			if (arr.get(i) != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(3);
		arr.add(4);
		arr.add(-1);
		arr.add(1);

		System.out.println("ArrayList: " + arr);
		System.out.println("First Missing Positive Number: " + firstMissing(arr));
	}
}
