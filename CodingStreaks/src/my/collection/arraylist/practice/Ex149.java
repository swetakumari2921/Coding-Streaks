package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex149 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

		ArrayList<Integer> result = new ArrayList<>();

		// Add even index elements first
		for (int i = 0; i < arr.length; i += 2) {
			result.add(arr[i]);
		}

		// Add odd index elements next
		for (int i = 1; i < arr.length; i += 2) {
			result.add(arr[i]);
		}

		System.out.println(result);
	}
}
