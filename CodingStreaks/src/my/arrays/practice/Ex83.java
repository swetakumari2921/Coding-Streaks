package my.arrays.practice;

public class Ex83 {

	public static int countSubarrays(int[] arr, int m) {
		int n = arr.length;

		int[] remainder = new int[m];
		int prefixSum = 0;
		int count = 0;

		remainder[0] = 1;

		for (int i = 0; i < n; i++) {
			prefixSum += arr[i];

			int rem = prefixSum % m;
			if (rem < 0) {
				rem += m;
			}

			count += remainder[rem];

			remainder[rem]++;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 0, -2, -3, 1 };
		int m = 5;

		int result = countSubarrays(arr, m);
		System.out.println("Count = " + result);
	}
}