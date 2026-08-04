package my.vector.practice;

import java.util.Vector;

public class Ex37 {

	public static Vector<Integer> difference(Vector<Integer> v1, Vector<Integer> v2) {

		Vector<Integer> result = new Vector<>();

		for (Integer num : v1) {
			if (!v2.contains(num)) {
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		Vector<Integer> v2 = new Vector<>();
		v2.add(20);
		v2.add(40);
		v2.add(60);

		System.out.println("Vector 1 : " + v1);
		System.out.println("Vector 2 : " + v2);

		Vector<Integer> result = difference(v1, v2);

		System.out.println("Difference (v1 - v2): " + result);
	}
}
