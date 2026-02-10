package my.strings.practice;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter sentence:");
		String sentence = sc.nextLine();

		System.out.println("Enter word to replace:");
		String oldWord = sc.nextLine();

		System.out.println("Enter new word:");
		String newWord = sc.nextLine();

		String[] words = sentence.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(oldWord)) {
				result = result + newWord;
			} else {
				result = result + words[i];
			}

			if (i != words.length - 1) {
				result = result + " ";
			}
		}

		System.out.println("Updated sentence:");
		System.out.println(result);
	}
}
