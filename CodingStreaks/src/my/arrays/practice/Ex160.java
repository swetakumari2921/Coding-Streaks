package my.arrays.practice;

public class Ex160 {
	public static void waveSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i += 2) {

			// Swap if current element is smaller than next
			if (arr[i] < arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

	public static void printArray(int arr[]) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 7, 8, 9, 10 };

		waveSort(arr);

		System.out.println("Wave Form Array:");
		printArray(arr);
	}
}