package my.strings.practice;

import java.util.Scanner;

public class Ex71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter main string:");
		String s = sc.nextLine();

		System.out.println("Enter target string:");
		String t = sc.nextLine();

		int[] freq = new int[256];

		for (int i = 0; i < t.length(); i++) {
			freq[t.charAt(i)]++;
		}

		int start = 0, minLen = Integer.MAX_VALUE, count = t.length();
		int minStart = 0;

		for (int end = 0; end < s.length(); end++) {

			if (freq[s.charAt(end)] > 0) {
				count--;
			}

			freq[s.charAt(end)]--;

			while (count == 0) {

				if (end - start + 1 < minLen) {
					minLen = end - start + 1;
					minStart = start;
				}

				freq[s.charAt(start)]++;

				if (freq[s.charAt(start)] > 0) {
					count++;
				}

				start++;
			}
		}

		if (minLen == Integer.MAX_VALUE) {
			System.out.println("No window found");
		} else {
			System.out.println("Minimum window substring:");
			System.out.println(s.substring(minStart, minStart + minLen));
		}
	}
}
