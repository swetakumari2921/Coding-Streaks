package my.arrays.practice;

public class Ex153 {

	public static void sortEvenOdd(int[] arr) {

		int n = arr.length;

		// Step 1: Separate even and odd manually into temp arrays
		int[] even = new int[n];
		int[] odd = new int[n];

		int e = 0, o = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even[e++] = arr[i];
			} else {
				odd[o++] = arr[i];
			}
		}

		// Step 2: Sort even array (simple bubble sort)
		for (int i = 0; i < e - 1; i++) {
			for (int j = 0; j < e - i - 1; j++) {
				if (even[j] > even[j + 1]) {
					int temp = even[j];
					even[j] = even[j + 1];
					even[j + 1] = temp;
				}
			}
		}

		// Step 3: Sort odd array (bubble sort)
		for (int i = 0; i < o - 1; i++) {
			for (int j = 0; j < o - i - 1; j++) {
				if (odd[j] > odd[j + 1]) {
					int temp = odd[j];
					odd[j] = odd[j + 1];
					odd[j + 1] = temp;
				}
			}
		}

		// Step 4: Merge back (even first, then odd)
		int idx = 0;

		for (int i = 0; i < e; i++) {
			arr[idx++] = even[i];
		}

		for (int i = 0; i < o; i++) {
			arr[idx++] = odd[i];
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 3, 1, 6, 7, 4 };

		sortEvenOdd(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
