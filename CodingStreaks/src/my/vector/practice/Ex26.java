package my.vector.practice;

import java.util.Vector;

public class Ex26 {

	public static void moveZeros(Vector<Integer> vec) {
		int index = 0;

		// Move all non-zero elements to the front
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i) != 0) {
				int temp = vec.get(index);
				vec.set(index, vec.get(i));
				vec.set(i, temp);
				index++;
			}
		}
	}

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();

		vec.add(0);
		vec.add(1);
		vec.add(0);
		vec.add(3);
		vec.add(12);
		vec.add(0);
		vec.add(5);

		moveZeros(vec);

		System.out.println(vec);
	}
}
