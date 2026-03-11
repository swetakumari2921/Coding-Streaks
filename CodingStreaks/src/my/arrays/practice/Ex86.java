package my.arrays.practice;

public class Ex86 {

	public static int largestSubarray(int[] arr, int k) {

		int n = arr.length;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum += arr[j];

				if (sum <= k) {
					int len = j - i + 1;
					if (len > maxLen)
						maxLen = len;
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 4, 1 };
		int k = 5;

		int result = largestSubarray(arr, k);
		System.out.println("Largest Subarray Length: " + result);
	}
}
