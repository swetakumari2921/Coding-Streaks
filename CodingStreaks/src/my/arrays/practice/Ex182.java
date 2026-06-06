package my.arrays.practice;

public class Ex182 {

	static class Range {
		int start, end;

		Range(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static Range findSmallestRange(int[][] arr, int k) {

		int[] idx = new int[k]; // pointer for each array

		int bestStart = 0;
		int bestEnd = Integer.MAX_VALUE;

		while (true) {

			int minVal = Integer.MAX_VALUE;
			int maxVal = Integer.MIN_VALUE;
			int minIndex = -1;

			// find min, max among current elements
			for (int i = 0; i < k; i++) {

				if (idx[i] == arr[i].length) {
					return new Range(bestStart, bestEnd);
				}

				int val = arr[i][idx[i]];

				if (val < minVal) {
					minVal = val;
					minIndex = i;
				}

				if (val > maxVal) {
					maxVal = val;
				}
			}

			// update best range
			if (maxVal - minVal < bestEnd - bestStart) {
				bestStart = minVal;
				bestEnd = maxVal;
			}

			// move pointer of array having minimum element
			idx[minIndex]++;
		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 0, 9, 10, 11 } };

		Range r = findSmallestRange(arr, arr.length);

		System.out.println("Smallest Range = [" + r.start + ", " + r.end + "]");
	}
}
