package my.vector.practice;

import java.util.Vector;

public class Ex05 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		// get element by index
		int index = 2;

		int element = v.get(index);

		System.out.println("Element at index " + index + " = " + element);
	}
}
