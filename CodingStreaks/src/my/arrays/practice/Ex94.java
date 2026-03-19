package my.arrays.practice;

public class Ex94 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3 };
		int n = arr.length;

		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int first = arr[i];
			int second = -1;
			int len = 0;

			for (int j = i; j < n; j++) {
				if (arr[j] == first || arr[j] == second || second == -1) {
					if (second == -1 && arr[j] != first) {
						second = arr[j];
					}
					len++;
				} else {
					break;
				}
			}
			if (len > maxLen) {
				maxLen = len;
			}
		}

		System.out.println("Length of longest subarray with at most 2 distinct elements: " + maxLen);
	}
}
