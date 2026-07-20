package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex212 {

	public static int longestPrefixSuffix(ArrayList<Integer> list) {
		int n = list.size();

		for (int len = n - 1; len >= 1; len--) {
			boolean match = true;

			for (int i = 0; i < len; i++) {
				if (!list.get(i).equals(list.get(n - len + i))) {
					match = false;
					break;
				}
			}

			if (match) {
				return len;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);

		int result = longestPrefixSuffix(list);

		System.out.println("Longest Prefix which is also Suffix Length: " + result);
	}
}
