package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex108 {

	public static ArrayList<Integer> countDistinct(int[] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i <= arr.length - k; i++) {
			ArrayList<Integer> temp = new ArrayList<>();

			for (int j = i; j < i + k; j++) {
				if (!temp.contains(arr[j])) {
					temp.add(arr[j]);
				}
			}

			result.add(temp.size());
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
		int k = 4;

		ArrayList<Integer> res = countDistinct(arr, k);

		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}
