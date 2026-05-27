package my.arrays.practice;

import java.util.Scanner;

public class Ex170 {

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		if (isPrime(sum)) {
			System.out.println("Sum is Prime");
		} else {
			System.out.println("Sum is Not Prime");
		}
	}
}
