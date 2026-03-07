package my.strings.practice;

import java.util.Scanner;

public class Ex82 {

	public static void computeLPS(String pat, int[] lps) {

		int len = 0;
		int i = 1;
		lps[0] = 0;

		while (i < pat.length()) {

			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}

	public static void KMPSearch(String txt, String pat) {

		int m = pat.length();
		int n = txt.length();

		int[] lps = new int[m];

		computeLPS(pat, lps);

		int i = 0, j = 0;

		while (i < n) {

			if (pat.charAt(j) == txt.charAt(i)) {
				i++;
				j++;
			}

			if (j == m) {
				System.out.println("Pattern found at index " + (i - j));
				j = lps[j - 1];
			} else if (i < n && pat.charAt(j) != txt.charAt(i)) {

				if (j != 0)
					j = lps[j - 1];
				else
					i++;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text:");
		String txt = sc.nextLine();

		System.out.println("Enter pattern:");
		String pat = sc.nextLine();

		KMPSearch(txt, pat);
	}
}
