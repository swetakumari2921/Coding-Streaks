package my.strings.practice;

import java.util.Scanner;

// Find smallest word in a sentence

public class Ex29 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();

		String[] words = sentence.split(" ");

		String smallest = words[0];

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() < smallest.length()) {
				smallest = words[i];
			}
		}

		System.out.println("Smallest word: " + smallest);
		
		sc.close();
	}
}
