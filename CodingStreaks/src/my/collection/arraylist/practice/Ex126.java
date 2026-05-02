package my.collection.arraylist.practice;

import java.util.*;

class Pair {
	int value;
	int index;

	Pair(int v, int i) {
		value = v;
		index = i;
	}
}

public class Ex126 {

	public static int minSwaps(ArrayList<Integer> arr) {

		int n = arr.size();

		// create pair list
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Pair(arr.get(i), i));
		}

		// sort based on value
		Collections.sort(list, new Comparator<Pair>() {
			public int compare(Pair a, Pair b) {
				return a.value - b.value;
			}
		});

		boolean[] visited = new boolean[n];
		int swaps = 0;

		for (int i = 0; i < n; i++) {

			if (visited[i] || list.get(i).index == i) {
				continue;
			}

			int cycleSize = 0;
			int j = i;

			while (!visited[j]) {
				visited[j] = true;
				j = list.get(j).index;
				cycleSize++;
			}

			if (cycleSize > 1) {
				swaps += (cycleSize - 1);
			}
		}

		return swaps;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);

		System.out.println(minSwaps(arr));
	}
}
