package my.strings.practice;

import java.util.Scanner;

public class Ex167 {

	static String toRoman(int num) {

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		String result = "";

		for (int i = 0; i < values.length; i++) {

			while (num >= values[i]) {
				result += romans[i];
				num -= values[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(toRoman(num));
	}
}
