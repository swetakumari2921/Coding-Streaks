package my.arrays.practice;

public class Ex158 {

	// Function to check if array can be sorted by one swap
	public static boolean canBeSortedByOneSwap(int[] arr) {
		int n = arr.length;

		int first = -1;
		int second = -1;

		// Find positions where order is wrong
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {

				if (first == -1) {
					first = i;
				}

				second = i + 1;
			}
		}

		// Already sorted
		if (first == -1) {
			return true;
		}

		// Swap elements
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

		// Check if sorted after swap
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 4, 2, 6 };

		if (canBeSortedByOneSwap(arr)) {
			System.out.println("Array can be sorted by one swap");
		} else {
			System.out.println("Array cannot be sorted by one swap");
		}
	}
}
