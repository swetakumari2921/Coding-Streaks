package my.arrays.practice;

public class Ex162 {

	// Function to find GCD of two numbers
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 24, 36, 48 };

		int result = arr[0];

		// Find GCD of all array elements
		for (int i = 1; i < arr.length; i++) {
			result = gcd(result, arr[i]);
		}

		System.out.println("GCD of array elements: " + result);
	}
}
