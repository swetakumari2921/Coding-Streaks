package my.collection.arraylist.practice;

import java.util.*;

public class Ex78 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 0, 1, 1, 0, 0));

		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0, maxLen = 0;

		map.put(0, -1);

		for (int i = 0; i < list.size(); i++) {
			int val = list.get(i) == 0 ? -1 : 1;
			sum += val;

			if (map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - map.get(sum));
			} else {
				map.put(sum, i);
			}
		}

		System.out.println(maxLen);
	}
}
