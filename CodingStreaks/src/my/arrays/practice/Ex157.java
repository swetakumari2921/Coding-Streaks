package my.arrays.practice;

public class Ex157 {

	public static void partitionArray(int[] arr, int pivot) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			while (left <= right && arr[left] < pivot) {
				left++;
			}

			while (left <= right && arr[right] >= pivot) {
				right--;
			}

			if (left < right) {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}

		System.out.println("Partitioned Array:");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 4, 8, 3, 1, 2, 5 };
		int pivot = 5;

		partitionArray(arr, pivot);
	}
}
