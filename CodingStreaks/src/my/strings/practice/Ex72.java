package my.strings.practice;

import java.util.Scanner;

public class Ex72 {

	public static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String s = sc.nextLine();

		int n = s.length();
		long total = factorial(n);

		int[] freq = new int[256];

		for (int i = 0; i < n; i++) {
			freq[s.charAt(i)]++;
		}

		long duplicate = 1;
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 1) {
				duplicate = duplicate * factorial(freq[i]);
			}
		}

		long result = total / duplicate;

		System.out.println("Distinct anagrams:");
		System.out.println(result);
	}
}
