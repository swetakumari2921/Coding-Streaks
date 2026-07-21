package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex213 {

	public static ArrayList<Integer> findRepeatingPattern(ArrayList<Integer> list, int k) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i <= list.size() - k; i++) {
			StringBuilder pattern = new StringBuilder();

			for (int j = 0; j < k; j++) {
				pattern.append(list.get(i + j)).append(",");
			}

			String key = pattern.toString();

			if (map.containsKey(key)) {
				ArrayList<Integer> result = new ArrayList<>();
				for (int j = 0; j < k; j++) {
					result.add(list.get(i + j));
				}
				return result;
			}

			map.put(key, i);
		}

		return new ArrayList<>();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		int k = 3;

		ArrayList<Integer> pattern = findRepeatingPattern(list, k);

		if (pattern.isEmpty()) {
			System.out.println("No repeating pattern found.");
		} else {
			System.out.println("Repeating Pattern: " + pattern);
		}
	}
}
