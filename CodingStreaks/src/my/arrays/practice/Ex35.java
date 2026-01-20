package my.arrays.practice;

// Find majority element (element appearing more than n/2 times).

public class Ex35 {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 2, 3, 2, 2 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > n / 2) {
				System.out.println("Majority Element: " + arr[i]);
				return;
			}
		}

		System.out.println("No Majority Element");
	}
}
