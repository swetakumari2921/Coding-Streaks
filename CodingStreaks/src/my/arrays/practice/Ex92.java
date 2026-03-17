package my.arrays.practice;

import java.util.Arrays;

public class Ex92 {
	static class Pair {
		int value;
		int index;

		Pair(int v, int i) {
			value = v;
			index = i;
		}
	}

	public static int minSwaps(int[] arr) {
		int n = arr.length;
		Pair[] pairs = new Pair[n];

		for (int i = 0; i < n; i++) {
			pairs[i] = new Pair(arr[i], i);
		}

		Arrays.sort(pairs, (a, b) -> a.value - b.value);

		boolean[] visited = new boolean[n];
		int swaps = 0;

		for (int i = 0; i < n; i++) {
			if (visited[i] || pairs[i].index == i)
				continue;

			int cycleSize = 0;
			int j = i;

			while (!visited[j]) {
				visited[j] = true;
				j = pairs[j].index;
				cycleSize++;
			}

			if (cycleSize > 1)
				swaps += (cycleSize - 1);
		}

		return swaps;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		System.out.println("Minimum swaps required: " + minSwaps(arr));
	}
}
