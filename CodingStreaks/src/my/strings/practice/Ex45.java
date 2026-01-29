package my.strings.practice;

// Find longest substring without repeating characters

import java.util.*;

public class Ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int n = str.length();
		int[] lastIndex = new int[256];
		Arrays.fill(lastIndex, -1);

		int maxLength = 0;
		int start = 0;

		for (int end = 0; end < n; end++) {
			char ch = str.charAt(end);

			if (lastIndex[ch] >= start) {
				start = lastIndex[ch] + 1;
			}

			lastIndex[ch] = end; // update last index
			maxLength = Math.max(maxLength, end - start + 1);
		}

		System.out.println("Length of longest substring without repeating characters: " + maxLength);
		sc.close();
	}
}
