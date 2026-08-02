package my.vector.practice;

import java.util.HashSet;
import java.util.Vector;

public class Ex35 {

	public static Vector<Integer> findIntersection(Vector<Integer> v1, Vector<Integer> v2) {
		HashSet<Integer> set = new HashSet<>(v1);
		Vector<Integer> result = new Vector<>();

		for (int num : v2) {
			if (set.contains(num) && !result.contains(num)) {
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);

		Vector<Integer> v2 = new Vector<>();
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		v2.add(7);

		Vector<Integer> intersection = findIntersection(v1, v2);

		System.out.println("Vector 1: " + v1);
		System.out.println("Vector 2: " + v2);
		System.out.println("Intersection: " + intersection);
	}
}
