package my.arrays.practice;

public class Ex163 {
	// Function to find GCD
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// Function to find LCM of two numbers
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	// Function to find LCM of array
	public static int findLCM(int[] arr) {

		int result = arr[0];

		for (int i = 1; i < arr.length; i++) {
			result = lcm(result, arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 3, 9, 4 };

		int ans = findLCM(arr);

		System.out.println("LCM of array elements: " + ans);
	}
}
