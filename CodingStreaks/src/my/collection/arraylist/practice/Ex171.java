package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex171 {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 6, 1, 4, 5 };
		int k = 3;

		ArrayList<Integer> rem = new ArrayList<>();
		ArrayList<Integer> idx = new ArrayList<>();

		int sum = 0;
		int maxLen = 0;

		rem.add(0);
		idx.add(-1);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			int r = sum % k;
			if (r < 0) {
				r += k;
			}

			int pos = rem.indexOf(r);

			if (pos != -1) {
				int len = i - idx.get(pos);
				if (len > maxLen) {
					maxLen = len;
				}
			} else {
				rem.add(r);
				idx.add(i);
			}
		}

		System.out.println("Length = " + maxLen);
	}
}
