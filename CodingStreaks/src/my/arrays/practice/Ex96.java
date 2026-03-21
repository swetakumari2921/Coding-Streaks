package my.arrays.practice;

public class Ex96 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int len1 = 2;
		int len2 = 2;

		System.out.println(maxSumTwoSubarrays(arr, len1, len2));
	}

	public static int maxSumTwoSubarrays(int[] arr, int len1, int len2) {
		int n = arr.length;
		int[] prefix = new int[n + 1];
		for (int i = 0; i < n; i++) {
			prefix[i + 1] = prefix[i] + arr[i];
		}

		int maxSum = 0;

		for (int i = 0; i <= n - len1; i++) {
			int sum1 = prefix[i + len1] - prefix[i];
			for (int j = i + len1; j <= n - len2; j++) {
				int sum2 = prefix[j + len2] - prefix[j];
				maxSum = Math.max(maxSum, sum1 + sum2);
			}
		}

		for (int i = 0; i <= n - len2; i++) {
			int sum2 = prefix[i + len2] - prefix[i];
			for (int j = i + len2; j <= n - len1; j++) {
				int sum1 = prefix[j + len1] - prefix[j];
				maxSum = Math.max(maxSum, sum1 + sum2);
			}
		}

		return maxSum;
	}
}
