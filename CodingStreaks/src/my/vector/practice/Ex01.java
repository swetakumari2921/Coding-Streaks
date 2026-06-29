package my.vector.practice;

import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		// adding elements
		v.add(10);
		v.add(20);
		v.add(30);

		// add new element
		v.add(40);

		System.out.println("Vector after adding element: " + v);
	}
}
