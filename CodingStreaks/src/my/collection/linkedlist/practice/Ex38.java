package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<String> bookTitles = new LinkedList<>();

		System.out.print("Enter number of book titles: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the book titles:");
		for (int i = 0; i < n; i++) {
			bookTitles.add(sc.nextLine());
		}

		boolean isPalindrome = true;
		int start = 0;
		int end = bookTitles.size() - 1;

		while (start < end) {
			if (!bookTitles.get(start).equals(bookTitles.get(end))) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}

		System.out.println("Is the linked list palindrome? " + isPalindrome);
	}
}
