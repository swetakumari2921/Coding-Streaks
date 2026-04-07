package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex99 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(8);

		int n = list.size();

		for (int i = 0; i < n; i++) {
			int nextGreater = -1;

			for (int j = i + 1; j < n; j++) {
				if (list.get(j) > list.get(i)) {
					nextGreater = list.get(j);
					break;
				}
			}

			list.set(i, nextGreater);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
