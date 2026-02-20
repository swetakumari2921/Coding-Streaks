package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number digits in reverse order, end with -1:");
		LinkedList<Integer> list1 = new LinkedList<>();
		while (true) {
			int num = sc.nextInt();
			if (num == -1)
				break;
			list1.add(num);
		}

		System.out.println("Enter second number digits in reverse order, end with -1:");
		LinkedList<Integer> list2 = new LinkedList<>();
		while (true) {
			int num = sc.nextInt();
			if (num == -1)
				break;
			list2.add(num);
		}

		LinkedList<Integer> result = new LinkedList<>();
		int carry = 0;
		int n = Math.max(list1.size(), list2.size());

		for (int i = 0; i < n; i++) {
			int sum = carry;
			if (i < list1.size())
				sum += list1.get(i);
			if (i < list2.size())
				sum += list2.get(i);
			result.add(sum % 10);
			carry = sum / 10;
		}

		if (carry > 0)
			result.add(carry);

		System.out.println("Sum of the two numbers is (in reverse order):");
		for (int digit : result) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}
