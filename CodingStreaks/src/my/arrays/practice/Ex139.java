package my.arrays.practice;

public class Ex139 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };

		int n = arr.length;

		int firstOddIndex = -1;
		int prefixParity = 0; // 0 = even, 1 = odd
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			// convert to parity
			if (arr[i] % 2 != 0) {
				prefixParity ^= 1; // flip parity
			}

			if (prefixParity == 0) {
				maxLen = i + 1;
			} else {
				if (firstOddIndex == -1) {
					firstOddIndex = i;
				} else {
					int len = i - firstOddIndex;
					if (len > maxLen) {
						maxLen = len;
					}
				}
			}
		}

		System.out.println(maxLen);
	}
}
