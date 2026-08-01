package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex224 {

	static void generateCombinations(ArrayList<Integer> list, int k) {
		ArrayList<Integer> current = new ArrayList<>();
		backtrack(list, k, 0, current);
	}

	static void backtrack(ArrayList<Integer> list, int k, int index, ArrayList<Integer> current) {
		if (current.size() == k) {
			System.out.println(current);
			return;
		}

		for (int i = index; i < list.size(); i++) {
			current.add(list.get(i));
			backtrack(list, k, i + 1, current);
			current.remove(current.size() - 1);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		int k = 2;

		System.out.println("Combinations of size " + k + ":");
		generateCombinations(list, k);
	}
}
