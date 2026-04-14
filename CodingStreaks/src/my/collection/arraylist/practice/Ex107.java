package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex107 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(5);
		arr.add(1);
		arr.add(3);
		arr.add(2);

		int k = 3;
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i <= arr.size() - k; i++) {
			int sum = 0;

			for (int j = i; j < i + k; j++) {
				sum = sum + arr.get(j);
			}

			if (sum < minSum) {
				minSum = sum;
			}
		}

		System.out.println(minSum);
	}
}
