package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {

	static void generateBinary(int n) {

		Queue<String> queue = new LinkedList<>();

		// Add first binary number
		queue.add("1");

		for (int i = 1; i <= n; i++) {

			String current = queue.remove();

			System.out.print(current + " ");

			// Add next binary numbers
			queue.add(current + "0");
			queue.add(current + "1");
		}
	}

	public static void main(String[] args) {

		int n = 10;

		System.out.println("Binary Numbers:");

		generateBinary(n);
	}
}
