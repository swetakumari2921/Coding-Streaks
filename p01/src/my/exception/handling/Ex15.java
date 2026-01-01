package my.exception.handling;

import java.io.IOException;
import java.util.Scanner;

public class Ex15 {

	public void takeInt() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter an int: ");
		a = sc.nextInt();
		System.out.println("You inputted: " + a);
	}

	public void takeChar() throws IOException { // Exception occurs only in rare I/O failures (stream closed, hardware
												// failure, etc.).
		char ch;
		System.out.println("Enter a char: ");
		ch = (char)System.in.read(); // read only one single character
		System.out.println("You inputted: " + ch);
	}
}
