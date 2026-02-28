package my.strings.practice;

import java.util.Scanner;

public class Ex75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String s = sc.nextLine();

		System.out.println("Enter value of K:");
		int k = sc.nextInt();

		int[] freq = new int[256];
		int left = 0;
		int distinct = 0;
		int maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			if (freq[s.charAt(right)] == 0) {
				distinct++;
			}
			freq[s.charAt(right)]++;

			while (distinct > k) {
				freq[s.charAt(left)]--;
				if (freq[s.charAt(left)] == 0) {
					distinct--;
				}
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		System.out.println("Longest substring length: " + maxLen);
	}
}
