package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex225 {

	public static void generate(ArrayList<Integer> list, int index) {
		if (index == list.size()) {
			System.out.println(list);
			return;
		}

		for (int i = index; i < list.size(); i++) {
			Collections.swap(list, index, i); // Swap
			generate(list, index + 1); // Recur
			Collections.swap(list, index, i); // Backtrack
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println("Permutations:");
		generate(list, 0);
	}
}
