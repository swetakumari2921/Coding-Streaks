package my.arrays.practice;

import java.util.ArrayList;

public class Ex148 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		int index1 = 1;
		int index2 = 3;

		System.out.println("Before Swap: " + list);

		// Swapping elements
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);

		System.out.println("After Swap: " + list);
	}
}
