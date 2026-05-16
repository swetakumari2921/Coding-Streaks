package my.strings.practice;

import java.util.Scanner;

public class Ex156 {

	public static String compressString(String str) {

		String result = "";

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			// Count same consecutive characters
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			result = result + str.charAt(i) + count;

			count = 1;
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(compressString(str));

		sc.close();
	}
}
