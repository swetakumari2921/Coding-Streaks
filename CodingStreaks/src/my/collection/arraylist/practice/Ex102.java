package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex102 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayList<Integer> prefix = new ArrayList<>();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prefix.add(sum);
		}

		System.out.println(prefix);
	}
}
