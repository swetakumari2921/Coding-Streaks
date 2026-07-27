package my.vector.practice;

import java.util.Vector;

public class Ex29 {

	public static boolean isPalindrome(Vector<Integer> vector) {
		int left = 0;
		int right = vector.size() - 1;

		while (left < right) {
			if (!vector.get(left).equals(vector.get(right))) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(2);
		vector.add(1);

		if (isPalindrome(vector)) {
			System.out.println("Vector is a palindrome.");
		} else {
			System.out.println("Vector is not a palindrome.");
		}
	}
}
