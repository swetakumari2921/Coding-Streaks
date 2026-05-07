package my.arrays.practice;

public class Ex146 {

	public static double findMaxAverage(int[] arr, int k) {
		int n = arr.length;

		// sum of first window
		int windowSum = 0;

		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}

		int maxSum = windowSum;

		// slide the window
		for (int i = k; i < n; i++) {
			windowSum = windowSum + arr[i] - arr[i - k];
			if (windowSum > maxSum) {
				maxSum = windowSum;
			}
		}

		return (double) maxSum / k;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 12, -5, -6, 50, 3 };
		int k = 4;

		System.out.println(findMaxAverage(arr, k));
	}
}
