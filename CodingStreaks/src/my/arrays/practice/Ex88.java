package my.arrays.practice;

public class Ex88 {

	public static void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest])
			largest = left;

		if (right < n && arr[right] > arr[largest])
			largest = right;

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	public static int findKthLargest(int arr[], int n, int k) {

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		for (int i = n - 1; i >= n - k + 1; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}

		return arr[0];
	}

	public static void main(String[] args) {

		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int n = arr.length;
		int k = 3;

		int result = findKthLargest(arr, n, k);
		System.out.println("Kth largest element: " + result);
	}
}
