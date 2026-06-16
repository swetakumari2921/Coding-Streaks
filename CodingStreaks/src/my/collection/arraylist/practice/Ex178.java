package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex178 {

	public static ArrayList<Integer> frequencyRank(int[] arr) {

		ArrayList<Integer> values = new ArrayList<>();
		ArrayList<Integer> freq = new ArrayList<>();

		// Count frequencies
		for (int i = 0; i < arr.length; i++) {
			int index = values.indexOf(arr[i]);

			if (index == -1) {
				values.add(arr[i]);
				freq.add(1);
			} else {
				freq.set(index, freq.get(index) + 1);
			}
		}

		// Find rank for each element
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			int currentFreq = freq.get(values.indexOf(arr[i]));
			int rank = 1;

			for (int j = 0; j < freq.size(); j++) {
				if (freq.get(j) > currentFreq) {
					rank++;
				}
			}

			result.add(rank);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 4, 2, 2, 2, 5, 5, 1 };

		ArrayList<Integer> result = frequencyRank(arr);

		System.out.println("Frequency Ranks:");
		for (int rank : result) {
			System.out.print(rank + " ");
		}
	}
}
