package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex177 {

	public static ArrayList<Integer> replaceWithRank(int[] arr) {

		ArrayList<Integer> sorted = new ArrayList<>();

		for (int num : arr) {
			if (!sorted.contains(num)) {
				sorted.add(num);
			}
		}

		Collections.sort(sorted);

		ArrayList<Integer> ranks = new ArrayList<>();

		for (int num : arr) {
			int rank = sorted.indexOf(num) + 1;
			ranks.add(rank);
		}

		return ranks;
	}

	public static void main(String[] args) {

		int[] arr = { 40, 10, 20, 30 };

		ArrayList<Integer> result = replaceWithRank(arr);

		System.out.println("Ranks: " + result);
	}
}
