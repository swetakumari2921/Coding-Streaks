package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex90 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int even = 0;
		int odd = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.println("Even count: " + even);
		System.out.println("Odd count: " + odd);
	}
}
