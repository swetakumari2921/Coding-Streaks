package my.arrays.practice;

public class Ex143 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 0, 1, 1, 0 };
		int k = 4;

		int start = 0, sum = 0, maxLen = 0;

		for (int end = 0; end < arr.length; end++) {
			sum += arr[end];

			while (sum > k) {
				sum -= arr[start];
				start++;
			}

			int len = end - start + 1;
			if (len > maxLen) {
				maxLen = len;
			}
		}

		System.out.println("Longest length: " + maxLen);
	}
}
