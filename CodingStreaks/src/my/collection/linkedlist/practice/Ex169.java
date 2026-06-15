package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex169 {

	public static boolean isPerfectSquare(int n) {
		int root = (int) Math.sqrt(n);
		return root * root == n;
	}

	public static boolean isFibonacci(int n) {
		return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
	}

	public static void removeFibonacci(LinkedList<Integer> list) {

		int i = 0;

		while (i < list.size()) {
			if (isFibonacci(list.get(i))) {
				list.remove(i);
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(13);

		System.out.println("Original List: " + list);

		removeFibonacci(list);

		System.out.println("After Removing Fibonacci Numbers: " + list);
	}
}
