package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex113 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(2);

		int n = list.size();

		for (int i = 0; i < n; i++) {
			if ((i == 0 || list.get(i) > list.get(i - 1)) && (i == n - 1 || list.get(i) > list.get(i + 1))) {
				System.out.println(list.get(i));
				break;
			}
		}
	}
}
