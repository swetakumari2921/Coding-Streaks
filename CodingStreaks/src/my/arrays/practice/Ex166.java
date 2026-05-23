package my.arrays.practice;

public class Ex166 {

	// Function to check if array forms Arithmetic Progression
	static boolean isArithmeticProgression(int[] arr) {

		int n = arr.length;

		// Sort array manually using Bubble Sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Find common difference
		int diff = arr[1] - arr[0];

		// Check all consecutive differences
		for (int i = 2; i < n; i++) {
			if (arr[i] - arr[i - 1] != diff) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 3, 7, 9 };

		if (isArithmeticProgression(arr)) {
			System.out.println("Array forms Arithmetic Progression");
		} else {
			System.out.println("Array does not form Arithmetic Progression");
		}
	}
}
