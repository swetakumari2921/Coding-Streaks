package my.arrays.practice;

public class Ex138 {
	public static int countSubarrays(int[] arr, int k) {
		int left = 0, count = 0;
		long product = 1;

		for (int right = 0; right < arr.length; right++) {
			product *= arr[right];

			while (product >= k && left <= right) {
				product /= arr[left];
				left++;
			}

			count += (right - left + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(countSubarrays(arr, k));
	}
}
