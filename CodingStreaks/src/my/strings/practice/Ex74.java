package my.strings.practice;

import java.util.Scanner;

public class Ex74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s1 = sc.nextLine();

		System.out.println("Enter second string:");
		String s2 = sc.nextLine();

		int[] count1 = new int[26];
		int[] count2 = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			count1[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			count2[s2.charAt(i) - 'a']++;
		}

		int removals = 0;

		for (int i = 0; i < 26; i++) {
			removals += Math.abs(count1[i] - count2[i]);
		}

		System.out.println("Minimum characters to remove: " + removals);
	}
}
