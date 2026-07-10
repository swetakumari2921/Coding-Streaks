package my.vector.practice;

import java.util.Vector;

public class Ex12 {

	public class Ex6 {

		static int findIndex(Vector<Integer> vector, int element) {

			for (int i = 0; i < vector.size(); i++) {

				if (vector.get(i) == element) {
					return i;
				}
			}

			return -1;
		}

		public static void main(String[] args) {

			Vector<Integer> vector = new Vector<>();

			vector.add(5);
			vector.add(10);
			vector.add(15);
			vector.add(20);
			vector.add(25);

			int element = 15;

			int index = findIndex(vector, element);

			if (index != -1) {
				System.out.println("Element found at index: " + index);
			} else {
				System.out.println("Element not found");
			}
		}
	}
}
