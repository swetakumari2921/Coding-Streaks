package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex100 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(5);
		list.add(2);
		list.add(25);

		int n = list.size();

		for (int i = 0; i < n - 1; i++) {
			int nextSmaller = -1;
			for (int j = i + 1; j < n; j++) {
				if (list.get(j) < list.get(i)) {
					nextSmaller = list.get(j);
					break;
				}
			}
			list.set(i, nextSmaller);
		}

		list.set(n - 1, -1);

		for (int x : list)
			System.out.print(x + " ");
	}
}
