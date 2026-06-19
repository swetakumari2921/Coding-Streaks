package my.arrays.practice;

public class Ex196 {

	public static void nextPermutation(int[] arr) {
		int n = arr.length;

		int i = n - 2;

		// Find first decreasing element from right
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i >= 0) {
			int j = n - 1;

			// Find just larger element
			while (arr[j] <= arr[i]) {
				j--;
			}

			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// Reverse remaining part
		int left = i + 1;
		int right = n - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		nextPermutation(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
