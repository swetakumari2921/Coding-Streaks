package my.arrays.practice;

public class Ex140 {

	public static int countSubarrays(int[] arr) {
		int n = arr.length;

		int[] freq = new int[2 * n + 1]; // to handle negative index
		int offset = n;

		int sum = 0;
		int count = 0;

		freq[offset] = 1; // sum = 0 initially

		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 == 0)
				sum += 1; // even
			else
				sum -= 1; // odd

			count += freq[sum + offset];

			freq[sum + offset]++;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(countSubarrays(arr));
	}
}
