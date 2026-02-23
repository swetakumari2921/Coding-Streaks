package my.strings.practice;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];
        int len = 0;

        for (int i = 1; i < combined.length(); i++) {
            while (len > 0 && combined.charAt(i) != combined.charAt(len)) {
                len = lps[len - 1];
            }
            if (combined.charAt(i) == combined.charAt(len)) {
                lps[i] = ++len;
            }
        }

        int result = s.length() - lps[combined.length() - 1];

        System.out.println("Minimum characters to add: " + result);
    }
}