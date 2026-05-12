package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex141 {

	public static long productOfElements(ArrayList<Integer> list) {
		long product = 1;

		for (int i = 0; i < list.size(); i++) {
			product = product * list.get(i);
		}

		return product;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Product: " + productOfElements(list));
	}
}
