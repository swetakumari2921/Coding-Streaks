package my.arrays.practice;

public class Ex144 {

	public static int minWindowSize(int[] arr, int k) {

		int start = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;

		for (int end = 0; end < arr.length; end++) {

			sum = sum + arr[end];

			while (sum >= k) {

				int length = end - start + 1;

				if (length < minLength) {
					minLength = length;
				}

				sum = sum - arr[start];
				start++;
			}
		}

		if (minLength == Integer.MAX_VALUE) {
			return 0;
		}

		return minLength;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int k = 7;

		int result = minWindowSize(arr, k);

		System.out.println("Minimum window size = " + result);
	}
}
