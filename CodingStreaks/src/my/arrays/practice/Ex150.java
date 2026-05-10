package my.arrays.practice;

public class Ex150 {

	public static int countSubarrays(int[] arr, int k) {

		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {

			int distinct = 0;
			int[] freq = new int[1000];

			for (int j = i; j < n; j++) {

				if (freq[arr[j]] == 0) {
					distinct++;
				}

				freq[arr[j]]++;

				if (distinct <= k) {
					count++;
				} else {
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 3 };
		int k = 2;

		int result = countSubarrays(arr, k);

		System.out.println("Count of subarrays = " + result);
	}
}
