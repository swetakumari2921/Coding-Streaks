package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> number = new LinkedList<>();

		System.out.println("Enter 5 numbers:");

		for (int i = 1; i <= 5; i++) {
			number.add(sc.nextInt());
		}

		int count = 0;

		for (int i = 0; i < number.size(); i++) {

			if (number.indexOf(number.get(i)) == i) {
				count++;
			}
		}

		System.out.println("Number of unique numbers: " + count);

		sc.close();
	}
}
