package my.arrays.practice;

public class Ex141 {
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 22, 28, 29, 30, 40 };
		int target = 54;

		sort(arr);

		int l = 0;
		int r = arr.length - 1;

		int minDiff = Integer.MAX_VALUE;
		int a = 0, b = 0;

		while (l < r) {
			int sum = arr[l] + arr[r];

			if (Math.abs(target - sum) < minDiff) {
				minDiff = Math.abs(target - sum);
				a = arr[l];
				b = arr[r];
			}

			if (sum < target) {
				l++;
			} else {
				r--;
			}
		}

		System.out.println(a + " " + b);
	}
}
