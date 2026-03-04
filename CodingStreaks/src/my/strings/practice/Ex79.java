package my.strings.practice;

import java.util.Scanner;

public class Ex79 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter DNA string:");
		String s = sc.nextLine();

		int n = s.length();

		if (n < 10) {
			System.out.println("No repeated DNA sequences");
			return;
		}

		String[] substrings = new String[n];
		int index = 0;

		// Store all 10-length substrings
		for (int i = 0; i <= n - 10; i++) {
			substrings[index++] = s.substring(i, i + 10);
		}

		String[] result = new String[n];
		int resIndex = 0;

		for (int i = 0; i < index; i++) {

			int count = 1;

			for (int j = i + 1; j < index; j++) {
				if (substrings[i].equals(substrings[j])) {
					count++;
				}
			}

			if (count > 1) {

				boolean alreadyAdded = false;

				for (int k = 0; k < resIndex; k++) {
					if (result[k].equals(substrings[i])) {
						alreadyAdded = true;
						break;
					}
				}

				if (!alreadyAdded) {
					result[resIndex++] = substrings[i];
				}
			}
		}

		if (resIndex == 0) {
			System.out.println("No repeated DNA sequences");
		} else {
			System.out.println("Repeated DNA sequences:");
			for (int i = 0; i < resIndex; i++) {
				System.out.println(result[i]);
			}
		}
	}
}
