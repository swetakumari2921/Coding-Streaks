package my.strings.practice;

import java.util.*;

public class Ex51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter text string: ");
		String text = sc.nextLine();

		System.out.print("Enter pattern string: ");
		String pattern = sc.nextLine();

		int n = text.length();
		int m = pattern.length();

		if (m > n) {
			System.out.println("No anagram substrings found");
			return;
		}

		int[] freqP = new int[26];
		int[] freqW = new int[26];

		for (char ch : pattern.toCharArray()) {
			freqP[ch - 'a']++;
		}

		for (int i = 0; i < m; i++) {
			freqW[text.charAt(i) - 'a']++;
		}

		List<Integer> result = new ArrayList<>();

		for (int i = m; i < n; i++) {
			if (Arrays.equals(freqP, freqW)) {
				result.add(i - m);
			}

			freqW[text.charAt(i) - 'a']++;

			freqW[text.charAt(i - m) - 'a']--;
		}

		if (Arrays.equals(freqP, freqW)) {
			result.add(n - m);
		}

		if (result.isEmpty()) {
			System.out.println("No anagram substrings found");
		} else {
			System.out.println("Anagram substrings start at indices: " + result);
		}
	}
}
