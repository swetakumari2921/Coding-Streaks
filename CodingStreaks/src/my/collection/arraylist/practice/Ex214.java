package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex214 {

	public static boolean hasCyclicPattern(ArrayList<Integer> list) {
		int n = list.size();

		// Try every possible pattern length
		for (int len = 1; len <= n / 2; len++) {

			// Pattern length must divide total size
			if (n % len != 0)
				continue;

			boolean isPattern = true;

			for (int i = len; i < n; i++) {
				if (!list.get(i).equals(list.get(i % len))) {
					isPattern = false;
					break;
				}
			}

			if (isPattern)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);

		if (hasCyclicPattern(list))
			System.out.println("Cyclic Pattern Found");
		else
			System.out.println("No Cyclic Pattern");
	}
}
