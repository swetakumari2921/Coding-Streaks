package my.arrays.practice;

public class Ex85 {

	public static int smallestSubarray(int[] arr, int k) {
		int n = arr.length;
		int minLength = n + 1; 
		int start = 0, sum = 0;

		for (int end = 0; end < n; end++) {
			sum += arr[end]; // Add current element to sum

			while (sum >= k) {
				minLength = Math.min(minLength, end - start + 1);
				sum -= arr[start]; // Remove starting element
				start++;
			}
		}

		if (minLength == n + 1) {
			return -1; // or 0 if you prefer
		}

		return minLength;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 19 };
		int k = 51;
		int result = smallestSubarray(arr, k);
		System.out.println("Smallest subarray length: " + result);
	}
}
