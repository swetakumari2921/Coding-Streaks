package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex105 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -2, 5 };
		int k = 5;

		ArrayList<Integer> prefix = new ArrayList<>();
		prefix.add(0);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prefix.add(sum);
		}

		int count = 0;

		for (int i = 0; i < prefix.size(); i++) {
			for (int j = i + 1; j < prefix.size(); j++) {
				if (prefix.get(j) - prefix.get(i) == k) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
