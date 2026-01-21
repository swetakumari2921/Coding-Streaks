package my.strings.practice;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine().toLowerCase();

		int index = -1;

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				index = i;
				break;
			}
		}

		System.out.println("Last consonant index: " + index);
		sc.close();
	}
}
