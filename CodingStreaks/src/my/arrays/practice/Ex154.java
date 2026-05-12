package my.arrays.practice;

public class Ex154 {

	public static void zigZag(int[] arr) {

		boolean less = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (less) {
				// arr[i] should be smaller than arr[i+1]
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				// arr[i] should be greater than arr[i+1]
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			less = !less;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };

		zigZag(arr);

		System.out.println("Zig-Zag Array:");
		printArray(arr);
	}
}
