package my.collection.arraylist.practice;

public class Ex72 {

	public static int firstMissingPositive(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
				int temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 1 };
		int missing = firstMissingPositive(arr);
		System.out.println("First missing positive number: " + missing);
	}
}