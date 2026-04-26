package my.arrays.practice;

public class Ex133 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		int minLength = arr.length + 1;
		int sum = 0, start = 0;

		for (int end = 0; end < arr.length; end++) {
			sum += arr[end];

			while (sum >= target) {
				int length = end - start + 1;
				if (length < minLength) {
					minLength = length;
				}
				sum -= arr[start];
				start++;
			}
		}

		if (minLength == arr.length + 1) {
			System.out.println("No subarray found");
		} else {
			System.out.println("Smallest subarray length: " + minLength);
		}
	}
}
