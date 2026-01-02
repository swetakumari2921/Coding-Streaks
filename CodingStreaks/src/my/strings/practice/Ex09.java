package my.strings.practice;

import java.util.*;

// 10. Check if a string is palindrome

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		char [] a = sc.nextLine().toCharArray();
		
		int mark = 0;
		int i=0;
		int j = a.length-1;
		
		while(i<j) {
			if(a[i]!=a[j]) {
				mark=1;
				break;
			}
			i++;
			j--;
		}
		
		if(mark==0) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
