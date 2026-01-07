package my.strings.practice;

import java.util.Scanner;

// 22. Count frequency of each character

public class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();

        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Frequency of each character:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }

        sc.close();
	}
}
