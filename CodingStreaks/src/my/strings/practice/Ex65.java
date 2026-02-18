package my.strings.practice;

import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to convert into integer:");
		String s = sc.nextLine();

		int i = 0, n = s.length();
		while (i < n && s.charAt(i) == ' ')
			i++;

		int sign = 1;
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			if (s.charAt(i) == '-')
				sign = -1;
			i++;
		}

		long result = 0;
		while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			result = result * 10 + (s.charAt(i) - '0');

			if (sign == 1 && result > Integer.MAX_VALUE) {
				System.out.println("Result exceeds maximum integer. Output: " + Integer.MAX_VALUE);
				return;
			}
			if (sign == -1 && -result < Integer.MIN_VALUE) {
				System.out.println("Result exceeds minimum integer. Output: " + Integer.MIN_VALUE);
				return;
			}
			i++;
		}

		System.out.println("Converted integer is: " + (int) (sign * result));
	}
}
