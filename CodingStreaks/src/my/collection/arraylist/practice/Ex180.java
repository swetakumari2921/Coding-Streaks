package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex180 {

	public static ArrayList<Integer> decode(ArrayList<Integer> encoded) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < encoded.size() - 1; i += 2) {
			int freq = encoded.get(i);
			int value = encoded.get(i + 1);

			for (int j = 0; j < freq; j++) {
				result.add(value);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> encoded = new ArrayList<>();

		encoded.add(3);
		encoded.add(8);
		encoded.add(2);
		encoded.add(5);
		encoded.add(1);
		encoded.add(7);

		ArrayList<Integer> result = decode(encoded);

		System.out.println(result);
	}
}
