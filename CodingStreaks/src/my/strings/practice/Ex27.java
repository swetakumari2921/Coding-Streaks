package my.strings.practice;

import java.util.Scanner;

// Reverse words in a string
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 2: Convert string into words using spaces
        String[] words = new String[str.length()]; // max possible words
        int wordCount = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                temp += ch; // build the word
            } else {
                if (temp.length() > 0) { // end of a word
                    words[wordCount++] = temp;
                    temp = "";
                }
            }
        }

        // Add the last word if any
        if (temp.length() > 0) {
            words[wordCount++] = temp;
        }

        // Step 3: Print words in reverse order
        System.out.println("Reversed words:");
        for (int i = wordCount - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
