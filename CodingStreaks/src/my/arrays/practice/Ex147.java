package my.arrays.practice;

public class Ex147 {

	// Function to check if window contains all elements of small array
	static boolean containsAll(int[] windowFreq, int[] smallFreq) {
		for (int i = 0; i < 1000; i++) {
			if (smallFreq[i] > windowFreq[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8 };
		int[] small = { 1, 5, 9 };

		int[] smallFreq = new int[1000];
		int[] windowFreq = new int[1000];

		// Store frequency of small array elements
		for (int i = 0; i < small.length; i++) {
			smallFreq[small[i]]++;
		}

		int start = 0;
		int minLen = Integer.MAX_VALUE;
		int minStart = -1;

		for (int end = 0; end < arr.length; end++) {

			windowFreq[arr[end]]++;

			// Shrink window while it still contains all elements
			while (containsAll(windowFreq, smallFreq)) {

				int windowSize = end - start + 1;

				if (windowSize < minLen) {
					minLen = windowSize;
					minStart = start;
				}

				windowFreq[arr[start]]--;
				start++;
			}
		}

		if (minStart == -1) {
			System.out.println("No valid window found");
		} else {
			System.out.print("Smallest window: ");

			for (int i = minStart; i < minStart + minLen; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
