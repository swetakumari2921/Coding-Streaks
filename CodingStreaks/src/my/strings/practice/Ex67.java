package my.strings.practice;

import java.util.Scanner;

public class Ex67 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = sc.nextLine();

		System.out.println("Enter pattern:");
		String pattern = sc.nextLine();

		int n = text.length();
		int m = pattern.length();

		int[] lps = new int[m];
		computeLPS(pattern, lps);

		int i = 0;
		int j = 0;
		boolean found = false;

		while (i < n) {
			if (text.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
			}
			if (j == m) {
				System.out.println("Pattern found at index: " + (i - j));
				j = lps[j - 1];
				found = true;
			} else if (i < n && text.charAt(i) != pattern.charAt(j)) {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}

		if (!found) {
			System.out.println("Pattern not found in text.");
		}
	}

	public static void computeLPS(String pattern, int[] lps) {
		int length = 0;
		int i = 1;
		lps[0] = 0;

		while (i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(length)) {
				length++;
				lps[i] = length;
				i++;
			} else {
				if (length != 0) {
					length = lps[length - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}
}
