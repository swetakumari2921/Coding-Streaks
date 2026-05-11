package my.arrays.practice;

public class Ex151 {

	public static void firstNegativeInWindow(int[] arr, int k) {
		int n = arr.length;

		for (int i = 0; i <= n - k; i++) {
			boolean found = false;

			for (int j = i; j < i + k; j++) {
				if (arr[j] < 0) {
					System.out.print(arr[j] + " ");
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.print("0 ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;

		firstNegativeInWindow(arr, k);
	}
}
