package my.strings.practice;

import java.util.Scanner;

public class Ex169 {

	static boolean allPresent(int[] freq, int uniqueCount) {

		int count = 0;

		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				count++;
			}
		}

		return count == uniqueCount;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String str = sc.nextLine();

		int[] unique = new int[256];
		int uniqueCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (unique[ch] == 0) {
				unique[ch] = 1;
				uniqueCount++;
			}
		}

		int minLen = str.length() + 1;
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			int[] freq = new int[256];

			for (int j = i; j < str.length(); j++) {

				freq[str.charAt(j)]++;

				if (allPresent(freq, uniqueCount)) {

					int len = j - i + 1;

					if (len < minLen) {
						minLen = len;
						result = str.substring(i, j + 1);
					}

					break;
				}
			}
		}

		System.out.println("Smallest substring: " + result);
	}
}
