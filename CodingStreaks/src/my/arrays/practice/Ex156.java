package my.arrays.practice;

public class Ex156 {
	public static void sortPositiveNegative(int[] arr) {
		int[] temp = new int[arr.length];
		int index = 0;

		// Store negative numbers first
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[index] = arr[i];
				index++;
			}
		}

		// Store positive numbers next
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				temp[index] = arr[i];
				index++;
			}
		}

		// Copy back to original array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, -2, 7, -5, 0, -1, 8 };

		sortPositiveNegative(arr);

		System.out.println("Array after sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
