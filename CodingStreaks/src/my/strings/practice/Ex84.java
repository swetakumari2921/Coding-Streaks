package my.strings.practice;

import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		String t = "#";
		for (int i = 0; i < s.length(); i++) {
			t += s.charAt(i);
			t += "#";
		}

		int n = t.length();
		int[] p = new int[n];

		int center = 0;
		int right = 0;

		int maxLen = 0;
		int centerIndex = 0;

		for (int i = 0; i < n; i++) {

			int mirror = 2 * center - i;

			if (i < right)
				p[i] = Math.min(right - i, p[mirror]);

			int a = i + (1 + p[i]);
			int b = i - (1 + p[i]);

			while (a < n && b >= 0 && t.charAt(a) == t.charAt(b)) {
				p[i]++;
				a++;
				b--;
			}

			if (i + p[i] > right) {
				center = i;
				right = i + p[i];
			}

			if (p[i] > maxLen) {
				maxLen = p[i];
				centerIndex = i;
			}
		}

		int start = (centerIndex - maxLen) / 2;

		System.out.println("Longest Palindromic Substring: " + s.substring(start, start + maxLen));
	}
}
