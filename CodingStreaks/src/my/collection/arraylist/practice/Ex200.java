package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex200 {

	public static void findTwoUnique(ArrayList<Integer> list) {

		int xor = 0;

		// XOR of all elements
		for (int num : list) {
			xor ^= num;
		}

		// Find rightmost set bit
		int setBit = xor & -xor;

		int first = 0;
		int second = 0;

		// Divide elements into two groups
		for (int num : list) {
			if ((num & setBit) != 0) {
				first ^= num;
			} else {
				second ^= num;
			}
		}

		System.out.println("First Unique Element : " + first);
		System.out.println("Second Unique Element: " + second);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(5);

		System.out.println("ArrayList: " + list);

		findTwoUnique(list);
	}
}
