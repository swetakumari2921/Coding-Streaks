package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex104 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int k = 7;

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

		for (int right = 0; right < list.size(); right++) {
			sum += list.get(right);

			while (sum >= k) {
				int len = right - left + 1;
				if (len < minLen) {
					minLen = len;
				}
				sum -= list.get(left);
				left++;
			}
		}

		if (minLen == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(minLen);
		}
	}
}
