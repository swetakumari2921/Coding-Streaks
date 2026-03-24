package my.arrays.practice;

public class Ex100 {
	public static void main(String[] args) {
		int arr[] = { 2, -2, 2, -4 };
		int n = arr.length;

		int result = countSubarrays(arr, n);
		System.out.println(result);
	}

	public static int countSubarrays(int arr[], int n) {
		int[] freq = new int[n]; // remainder frequency
		int prefixSum = 0;
		int count = 0;

		freq[0] = 1; // important

		for (int i = 0; i < n; i++) {
			prefixSum += arr[i];

			int rem = prefixSum % n;

			// handle negative remainder
			if (rem < 0) {
				rem += n;
			}

			count += freq[rem]; // add previous same remainder count

			freq[rem]++; // update frequency
		}

		return count;
	}
}
