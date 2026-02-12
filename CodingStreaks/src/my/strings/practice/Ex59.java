package my.strings.practice;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to find all distinct substrings:");
		String s = sc.nextLine();

		int n = s.length();
		int count = 0;
		String[] substrings = new String[n * (n + 1) / 2];

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String sub = s.substring(i, j);
				boolean found = false;
				for (int k = 0; k < count; k++) {
					if (substrings[k].equals(sub)) {
						found = true;
						break;
					}
				}
				if (!found) {
					substrings[count++] = sub;
				}
			}
		}

		System.out.println("Number of distinct substrings: " + count);
	}
}
