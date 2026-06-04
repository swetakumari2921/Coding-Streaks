package my.strings.practice;

import java.util.Scanner;

public class Ex175 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();

		int n = str.length();
		String[] substrings = new String[n * (n + 1) / 2];

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				String sub = str.substring(i, j);

				boolean found = false;

				for (int k = 0; k < count; k++) {
					if (substrings[k].equals(sub)) {
						found = true;
						break;
					}
				}

				if (!found) {
					substrings[count] = sub;
					count++;
				}
			}
		}

		System.out.println("Count of Distinct Substrings = " + count);
	}
}
