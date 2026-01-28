package my.arrays.practice;

// Find maximum sum of i * arr[i] after rotations.

public class Ex44 {
	public static int maxSumAfterRotation(int[] arr) {
		int n = arr.length;
		int arrSum = 0;
		int currVal = 0;

		for (int i = 0; i < n; i++) {
			arrSum += arr[i];
			currVal += i * arr[i];
		}

		int maxVal = currVal;

		for (int i = 1; i < n; i++) {
			currVal = currVal + arrSum - n * arr[n - i];
			if (currVal > maxVal) {
				maxVal = currVal;
			}
		}

		return maxVal;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 20, 2, 10 };
		int result = maxSumAfterRotation(arr);
		System.out.println("Maximum sum after rotations: " + result);
	}
}
