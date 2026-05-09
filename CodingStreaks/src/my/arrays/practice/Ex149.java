package my.arrays.practice;

public class Ex149 {

	public static int longestUniqueSubarray(int[] arr) {

		int n = arr.length;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {

			boolean[] visited = new boolean[100001];
			int len = 0;

			for (int j = i; j < n; j++) {

				if (visited[arr[j]]) {
					break;
				}

				visited[arr[j]] = true;
				len++;

				if (len > maxLen) {
					maxLen = len;
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 4, 5 };

		int result = longestUniqueSubarray(arr);

		System.out.println("Longest subarray length = " + result);
	}
}
