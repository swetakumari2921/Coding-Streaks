package my.arrays.practice;

public class Ex105 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(i)) {
				sum += arr[i];
			}
		}

		System.out.println(sum);
	}

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
