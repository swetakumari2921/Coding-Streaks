package my.strings.practice;

public class Ex165 {

	// function to count digits
	static int countDigits(int n) {
		n = Math.abs(n); // handle negative numbers
		int count = 0;

		if (n == 0)
			return 1;

		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	// function to find number with max digits
	static int findMaxDigitNumber(int[] arr) {
		int maxDigits = 0;
		int result = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int digits = countDigits(arr[i]);

			if (digits > maxDigits) {
				maxDigits = digits;
				result = arr[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 345, 6, 7890, 45 };

		int ans = findMaxDigitNumber(arr);

		System.out.println("Number with maximum digits: " + ans);
	}
}
