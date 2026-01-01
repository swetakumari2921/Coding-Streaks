package my.exception.handling;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter 2 int: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Division is: " + c);
		} catch (ArithmeticException ex) {
			System.out.println("Denominator should not be 0");
		}
		int d = a + b;
		System.out.println("Sum is: " + d);
	}
}
