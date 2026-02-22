package my.strings.practice;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s1 = sc.nextLine();

		System.out.println("Enter second string:");
		String s2 = sc.nextLine();

		System.out.println("Enter shuffled string:");
		String s3 = sc.nextLine();

		if (s1.length() + s2.length() != s3.length()) {
			System.out.println("Not a valid shuffle");
			return;
		}

		int[] count = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			count[s2.charAt(i)]++;
		}

		for (int i = 0; i < s3.length(); i++) {
			count[s3.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				System.out.println("Not a valid shuffle");
				return;
			}
		}

		System.out.println("Valid shuffle");
	}
}
