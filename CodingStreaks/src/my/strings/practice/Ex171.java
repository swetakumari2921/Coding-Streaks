package my.strings.practice;

import java.util.Scanner;

public class Ex171 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();

		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		int firstMax = 0;
		int secondMax = 0;
		char firstChar = '\0';
		char secondChar = '\0';

		for (int i = 0; i < 256; i++) {

			if (freq[i] > firstMax) {
				secondMax = firstMax;
				secondChar = firstChar;

				firstMax = freq[i];
				firstChar = (char) i;
			} else if (freq[i] > secondMax && freq[i] < firstMax) {
				secondMax = freq[i];
				secondChar = (char) i;
			}
		}

		if (secondMax == 0) {
			System.out.println("No second most repeated character found");
		} else {
			System.out.println("Second most repeated character = " + secondChar);
			System.out.println("Frequency = " + secondMax);
		}

		sc.close();
	}
}
