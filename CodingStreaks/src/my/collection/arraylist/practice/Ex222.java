package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex222 {

	public static ArrayList<Integer> findSubsetSums(ArrayList<Integer> list) {
		ArrayList<Integer> result = new ArrayList<>();
		generateSums(list, 0, 0, result);
		Collections.sort(result);
		return result;
	}

	private static void generateSums(ArrayList<Integer> list, int index, int currentSum, ArrayList<Integer> result) {
		if (index == list.size()) {
			result.add(currentSum);
			return;
		}

		// Include current element
		generateSums(list, index + 1, currentSum + list.get(index), result);

		// Exclude current element
		generateSums(list, index + 1, currentSum, result);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(1);
		list.add(2);

		ArrayList<Integer> subsetSums = findSubsetSums(list);

		System.out.println("Subset Sums:");
		System.out.println(subsetSums);
	}
}
