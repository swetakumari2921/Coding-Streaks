package my.strings.practice;

import java.util.Scanner;

public class Ex97 {

	public static boolean canRearrange(String str) {

		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		int maxFreq = 0;

		for (int i = 0; i < 256; i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
			}
		}

		int n = str.length();

		if (maxFreq > (n + 1) / 2) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		boolean result = canRearrange(str);

		if (result) {
			System.out.println("Yes, the string can be rearranged to avoid adjacent duplicates.");
		} else {
			System.out.println("No, it is NOT possible to rearrange the string without adjacent duplicates.");
		}
	}
}
