package my.arrays.practice;

public class Ex145 {
	public static int countValidWindows(int[] arr, int k, int threshold) {

		int sum = 0;
		int count = 0;

		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}

		if (sum >= threshold) {
			count++;
		}

		for (int i = k; i < arr.length; i++) {

			sum = sum + arr[i] - arr[i - k];

			if (sum >= threshold) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int k = 3;
		int threshold = 6;

		int result = countValidWindows(arr, k, threshold);

		System.out.println(result);
	}
}
