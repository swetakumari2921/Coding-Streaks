package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex220 {

	// Convert string to LinkedList of digits
	public static LinkedList<Integer> toLinkedList(String num) {
		LinkedList<Integer> list = new LinkedList<>();
		for (char ch : num.toCharArray()) {
			list.add(ch - '0');
		}
		return list;
	}

	// Multiply two large numbers
	public static LinkedList<Integer> multiply(LinkedList<Integer> num1, LinkedList<Integer> num2) {

		int n1 = num1.size();
		int n2 = num2.size();

		int[] result = new int[n1 + n2];

		// Multiply from last digit to first digit
		for (int i = n1 - 1; i >= 0; i--) {
			for (int j = n2 - 1; j >= 0; j--) {

				int mul = num1.get(i) * num2.get(j);

				int sum = mul + result[i + j + 1];

				result[i + j + 1] = sum % 10;
				result[i + j] += sum / 10;
			}
		}

		LinkedList<Integer> answer = new LinkedList<>();

		boolean leadingZero = true;
		for (int digit : result) {
			if (digit == 0 && leadingZero) {
				continue;
			}
			leadingZero = false;
			answer.add(digit);
		}

		// If multiplication result is 0
		if (answer.isEmpty()) {
			answer.add(0);
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Large Number: ");
		String first = sc.next();

		System.out.print("Enter Second Large Number: ");
		String second = sc.next();

		LinkedList<Integer> num1 = toLinkedList(first);
		LinkedList<Integer> num2 = toLinkedList(second);

		LinkedList<Integer> result = multiply(num1, num2);

		System.out.print("Multiplication Result: ");
		for (int digit : result) {
			System.out.print(digit);
		}

		sc.close();
	}
}
