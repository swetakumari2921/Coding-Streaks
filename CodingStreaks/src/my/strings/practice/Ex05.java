package my.strings.practice;

import java.util.*;

// 6. Count spaces in a string

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		char ch;
		int count = 0;
		for(byte b = 0; b < str.length(); b++) {
			ch = str.charAt(b);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Total space: "+count);
	}
}
