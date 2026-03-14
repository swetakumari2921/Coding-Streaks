package my.arrays.practice;

public class Ex89 {
	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int countTriplets(int[] arr, int k) {
		int n = arr.length;
		sort(arr);
		int count = 0;

		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];

				if (sum < k) {
					count = count + (right - left);
					left++;
				} else {
					right--;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 3, 4, 7 };
		int k = 12;

		int result = countTriplets(arr, k);

		System.out.println("Number of triplets: " + result);
	}
}
