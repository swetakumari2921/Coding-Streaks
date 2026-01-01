package my.strings.practice;

import java.util.*;

// 1. Print a string character by character

public class Ex00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.next();
		
		for(byte b = 0; b< input.length(); b++) {
			System.out.println(input.charAt(b));
		}
		
		sc.close();
	}
}
