package my.collection.arraylist.practice;

public class Ex181 {

	public static int findPeak(int[] arr) {
		int n = arr.length;

		int low = 0;
		int high = n - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		int pivot = low;

		int peakIndex = (pivot - 1 + n) % n;
		return arr[peakIndex];
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };

		int peak = findPeak(arr);

		System.out.println("Peak Element: " + peak);
	}
}
