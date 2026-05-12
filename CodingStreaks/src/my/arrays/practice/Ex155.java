package my.arrays.practice;

public class Ex155 {

	public static void sortByAbsoluteDifference(int[] arr, int k) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;

			for (int j = i + 1; j < n; j++) {
				int diff1 = Math.abs(arr[j] - k);
				int diff2 = Math.abs(arr[minIdx] - k);

				if (diff1 < diff2) {
					minIdx = j;
				}
			}

			// swap
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 9, 2 };
		int k = 7;

		sortByAbsoluteDifference(arr, k);

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
