package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex221 {

	public static void main(String[] args) {
		String num1 = "98765";
		String num2 = "98764";

		LinkedList<Character> list1 = new LinkedList<>();
		LinkedList<Character> list2 = new LinkedList<>();

		// Store digits in LinkedLists
		for (char ch : num1.toCharArray()) {
			list1.add(ch);
		}

		for (char ch : num2.toCharArray()) {
			list2.add(ch);
		}

		int result = compare(list1, list2);

		if (result > 0) {
			System.out.println(num1 + " is greater");
		} else if (result < 0) {
			System.out.println(num2 + " is greater");
		} else {
			System.out.println("Both numbers are equal");
		}
	}

	static int compare(LinkedList<Character> list1, LinkedList<Character> list2) {

		// Compare lengths
		if (list1.size() > list2.size()) {
			return 1;
		}
		if (list1.size() < list2.size()) {
			return -1;
		}

		// Compare digit by digit
		for (int i = 0; i < list1.size(); i++) {
			char d1 = list1.get(i);
			char d2 = list2.get(i);

			if (d1 > d2) {
				return 1;
			}
			if (d1 < d2) {
				return -1;
			}
		}

		return 0;
	}
}
