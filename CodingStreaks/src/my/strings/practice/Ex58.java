package my.strings.practice;

import java.util.Scanner;

public class Ex58 {

	public static void generatePermutations(String str, String result) {

		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			generatePermutations(remaining, result + current);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		System.out.println("Permutations are:");
		generatePermutations(input, "");
	}
}
