package my.strings.practice;

import java.util.*;

// 8. Convert string to lowercase (without using toLowerCase())

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		
		for(byte b = 1; b<str.length(); b++) {
			if(arr[b] >= 'A' && arr[b] <= 'Z') {
				arr[b] = (char)(arr[b]+32);
			}
		}
		String result = new String(arr);
		System.out.println(result);
		sc.close();
	}
}
