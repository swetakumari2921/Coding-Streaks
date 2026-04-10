package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex103 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 0, 1, 1, 0 };
		int k = 4;

		int left = 0, sum = 0, maxLen = 0;
		ArrayList<Integer> result = new ArrayList<>();

		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];

			while (sum > k) {
				sum -= arr[left];
				left++;
			}

			if (right - left + 1 > maxLen) {
				maxLen = right - left + 1;
				result.clear();
				for (int i = left; i <= right; i++) {
					result.add(arr[i]);
				}
			}
		}

		System.out.println("Length: " + maxLen);
		System.out.println(result);
	}
}
