package my.arrays.practice;

public class Ex197 {
	static boolean hasZeroSumSubarray(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum += arr[j];

				if (sum == 0) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, -3, 1, 6 };

		System.out.println(hasZeroSumSubarray(arr));
	}
}
