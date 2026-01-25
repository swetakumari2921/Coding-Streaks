package my.arrays.practice;

// Find contiguous subarray with a given sum (positive numbers).

public class Ex40 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int target = 33;

		int left = 0;
		int sum = 0;
		boolean found = false;

		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];

			while (sum > target) {
				sum -= arr[left];
				left++;
			}

			if (sum == target) {
				System.out.println("Subarray found from index " + left + " to " + right);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No subarray found");
		}
	}
}
