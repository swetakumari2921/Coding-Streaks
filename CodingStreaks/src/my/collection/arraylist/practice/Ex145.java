package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex145 {
	static int maxMinFrequencyDifference(int[] arr) {
		ArrayList<Integer> elements = new ArrayList<>();
		ArrayList<Integer> frequencies = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int index = -1;

			for (int j = 0; j < elements.size(); j++) {
				if (elements.get(j) == arr[i]) {
					index = j;
					break;
				}
			}

			if (index == -1) {
				elements.add(arr[i]);
				frequencies.add(1);
			} else {
				frequencies.set(index, frequencies.get(index) + 1);
			}
		}

		int maxFreq = frequencies.get(0);
		int minFreq = frequencies.get(0);

		for (int i = 1; i < frequencies.size(); i++) {
			if (frequencies.get(i) > maxFreq) {
				maxFreq = frequencies.get(i);
			}

			if (frequencies.get(i) < minFreq) {
				minFreq = frequencies.get(i);
			}
		}

		return maxFreq - minFreq;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3, 4 };

		System.out.println(maxMinFrequencyDifference(arr)); // 2
	}
}
