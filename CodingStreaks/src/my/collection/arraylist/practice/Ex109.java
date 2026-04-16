package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex109 {

	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;

		ArrayList<Integer> result = firstNegative(arr, k);

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

	static ArrayList<Integer> firstNegative(int[] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> negatives = new ArrayList<>();

		int start = 0;

		for (int end = 0; end < arr.length; end++) {

			// store negative elements
			if (arr[end] < 0) {
				negatives.add(arr[end]);
			}

			// window size reached
			if (end - start + 1 == k) {

				// first negative
				if (negatives.size() > 0) {
					result.add(negatives.get(0));
				} else {
					result.add(0);
				}

				// remove element going out of window
				if (negatives.size() > 0 && arr[start] == negatives.get(0)) {
					negatives.remove(0);
				}

				start++;
			}
		}

		return result;
	}
}
