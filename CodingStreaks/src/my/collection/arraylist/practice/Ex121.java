package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex121 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(3);
		arr.add(6);
		arr.add(2);
		arr.add(1);
		arr.add(1);

		int n = arr.size();
		int repeating = -1;
		int missing = -1;

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr.get(j) == i) {
					count++;
				}
			}
			if (count == 0)
				missing = i;
			if (count == 2)
				repeating = i;
		}

		System.out.println(repeating);
		System.out.println(missing);
	}
}
