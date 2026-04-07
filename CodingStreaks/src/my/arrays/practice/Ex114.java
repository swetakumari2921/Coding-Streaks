package my.arrays.practice;

public class Ex114 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int n = arr.length;
		int mid = n / 2;

		for (int i = 0; i < mid / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[mid - 1 - i];
			arr[mid - 1 - i] = temp;
		}

		// Print array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
