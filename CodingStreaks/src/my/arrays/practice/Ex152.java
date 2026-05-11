package my.arrays.practice;

public class Ex152 {

	// Swap helper
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void sortByFrequency(int[] arr) {

		int n = arr.length;

		int[] freq = new int[n];
		boolean[] visited = new boolean[n];

		// Step 1: Count frequency manually
		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			freq[i] = count;
		}

		// Step 2: Sort by frequency (descending), if tie keep smaller value first
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				for (int j = i + 1; j < n; j++) {
					if (!visited[j]) {

						if (freq[i] < freq[j] || (freq[i] == freq[j] && arr[i] > arr[j])) {

							swap(arr, i, j);
							swap(freq, i, j);
						}
					}
				}
			}
		}

		// Step 3: Print result (skip duplicates already handled)
		boolean[] printed = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (printed[i])
				continue;

			for (int k = 0; k < freq[i]; k++) {
				System.out.print(arr[i] + " ");
			}

			printed[i] = true;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 5, 4, 3 };

		sortByFrequency(arr);
	}
}
