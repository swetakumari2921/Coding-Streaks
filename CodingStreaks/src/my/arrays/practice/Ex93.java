package my.arrays.practice;

import java.util.*;

public class Ex93 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 1, 2, 3);
		int k = 2;

		int left = 0, maxLen = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int right = 0; right < list.size(); right++) {
			int val = list.get(right);
			map.put(val, map.getOrDefault(val, 0) + 1);

			while (map.size() > k) {
				int leftVal = list.get(left);
				map.put(leftVal, map.get(leftVal) - 1);
				if (map.get(leftVal) == 0) {
					map.remove(leftVal);
				}
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		System.out.println(maxLen);
	}
}
