package my.strings.practice;

import java.util.Scanner;

public class Ex81 {

	static int d = 256;

	public static void search(String text, String pattern, int q) {

		int m = pattern.length();
		int n = text.length();
		int p = 0;
		int t = 0;
		int h = 1;

		for (int i = 0; i < m - 1; i++)
			h = (h * d) % q;

		for (int i = 0; i < m; i++) {
			p = (d * p + pattern.charAt(i)) % q;
			t = (d * t + text.charAt(i)) % q;
		}

		for (int i = 0; i <= n - m; i++) {

			if (p == t) {
				int j;
				for (j = 0; j < m; j++) {
					if (text.charAt(i + j) != pattern.charAt(j))
						break;
				}

				if (j == m)
					System.out.println("Pattern found at index " + i);
			}

			if (i < n - m) {
				t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

				if (t < 0)
					t = t + q;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = sc.nextLine();

		System.out.println("Enter pattern:");
		String pattern = sc.nextLine();

		search(text, pattern, 101);
	}
}
