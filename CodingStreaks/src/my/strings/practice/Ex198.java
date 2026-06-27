package my.strings.practice;

import java.util.Scanner;

public class Ex198 {

	public static int myAtoi(String str) {
		int i = 0;
		int n = str.length();
		int sign = 1;
		int result = 0;

		// Skip leading spaces
		while (i < n && str.charAt(i) == ' ') {
			i++;
		}

		// Check sign
		if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
			if (str.charAt(i) == '-') {
				sign = -1;
			}
			i++;
		}

		// Convert digits to integer
		while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			int digit = str.charAt(i) - '0';

			// Overflow check
			if (result > (Integer.MAX_VALUE - digit) / 10) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			result = result * 10 + digit;
			i++;
		}

		return result * sign;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.nextLine();

		int ans = myAtoi(str);

		System.out.println("Integer: " + ans);
	}
}
