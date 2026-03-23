package my.arrays.practice;

public class Ex99 {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 4, 5 };
		int k = 4;

		int n = arr.length;
		int kIndex = -1;

		// Find index of k
		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				kIndex = i;
				break;
			}
		}

		if (kIndex == -1) {
			System.out.println(0);
			return;
		}

		// Transform array relative to k
		int[] transformed = new int[n];
		for (int i = 0; i < n; i++) {
			if (arr[i] > k)
				transformed[i] = 1;
			else if (arr[i] < k)
				transformed[i] = -1;
			else
				transformed[i] = 0;
		}

		// Count prefix sums left of k
		int leftBalance = 0;
		int[] leftCounts = new int[2 * n + 1]; // index = balance + n
		leftCounts[n] = 1; // empty prefix

		for (int i = kIndex - 1; i >= 0; i--) {
			leftBalance += transformed[i];
			leftCounts[leftBalance + n]++;
		}

		// Count subarrays including k
		int rightBalance = 0;
		int count = 0;
		for (int i = kIndex; i < n; i++) {
			rightBalance += transformed[i];
			count += leftCounts[n - rightBalance]; // equal halves (even length)
			count += leftCounts[n - rightBalance + 1]; // differ by 1 (odd length)
		}

		System.out.println("Number of subarrays with median " + k + " = " + count);
	}
}
