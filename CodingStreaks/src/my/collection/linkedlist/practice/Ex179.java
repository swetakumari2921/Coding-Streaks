package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Collections;

public class Ex179 {

	static void findKLargest(LinkedList<Integer> list, int k) {
		Collections.sort(list);

		System.out.println(k + " Largest Elements:");

		for (int i = list.size() - 1; i >= list.size() - k; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(12);
		list.add(5);
		list.add(78);
		list.add(23);
		list.add(45);
		list.add(90);

		int k = 3;

		findKLargest(list, k);
	}
}
