package my.arrays.practice;

public class Ex137 {
	public static void main(String[] args) {
		int[] arr = { 3, -4, 2, -3, -1, 7, -5 };
		int n = arr.length;

		int currMin = arr[0];
		int minSum = arr[0];

		for (int i = 1; i < n; i++) {
			currMin = Math.min(arr[i], currMin + arr[i]);
			minSum = Math.min(minSum, currMin);
		}

		System.out.println(minSum);
	}
}
