package my.arrays.practice;

public class Ex136 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		int count = 0;
		int prefixSum = 0;
		int evenCount = 1;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			if (prefixSum % 2 == 0) {
				count += oddCount;
				evenCount++;
			} else {
				count += evenCount;
				oddCount++;
			}
		}

		System.out.println("Count of subarrays with odd sum: " + count);
	}
}
