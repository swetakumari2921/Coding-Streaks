package my.arrays.practice;

public class Ex195 {

	public static int[] countSmallerRight(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					count++;
				}
			}

			result[i] = count;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 1 };

		int[] result = countSmallerRight(arr);

		System.out.print("Output: ");
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
}
