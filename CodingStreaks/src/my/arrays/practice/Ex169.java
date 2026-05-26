package my.arrays.practice;

public class Ex169 {

	// Function to find element closest to mean
	public static int closestToMean(int[] arr) {

		int n = arr.length;
		int sum = 0;

		// Calculate sum
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		// Calculate mean
		double mean = (double) sum / n;

		// Assume first element is closest
		int closest = arr[0];
		double minDiff = Math.abs(arr[0] - mean);

		// Find closest element
		for (int i = 1; i < n; i++) {

			double diff = Math.abs(arr[i] - mean);

			if (diff < minDiff) {
				minDiff = diff;
				closest = arr[i];
			}
		}

		return closest;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 10, 12 };

		int result = closestToMean(arr);

		System.out.println("Element closest to mean = " + result);
	}
}
