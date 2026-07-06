package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex198 {

	static ArrayList<Integer> findElements(ArrayList<Integer> list, int k) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;

			// Count frequency of current element
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			// Check if already added
			boolean found = false;
			for (int j = 0; j < result.size(); j++) {
				if (result.get(j).equals(list.get(i))) {
					found = true;
					break;
				}
			}

			if (count == k && !found) {
				result.add(list.get(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(6);

		int k = 2;

		ArrayList<Integer> ans = findElements(list, k);

		if (ans.size() == 0) {
			System.out.println("No element found");
		} else {
			System.out.println("Elements with frequency exactly " + k + " : " + ans);
		}
	}
}
