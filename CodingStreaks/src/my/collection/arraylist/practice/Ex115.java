package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex115 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int target = 10;

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ArrayList<Integer> list = new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						result.add(list);
					}
				}
			}
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
