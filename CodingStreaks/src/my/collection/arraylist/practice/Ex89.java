package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex89 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(0);
		list.add(3);

		int zeroCount = 0;
		ArrayList<Integer> result = new ArrayList<>();

		for (int num : list) {
			if (num == 0) {
				zeroCount++;
			} else {
				result.add(num);
			}
		}

		for (int i = 0; i < zeroCount; i++) {
			result.add(0, 0);
		}

		System.out.println(result);
	}
}
