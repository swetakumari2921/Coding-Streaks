package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex142 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20); // duplicate

		boolean isUnique = true;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					isUnique = false;
					break;
				}
			}
			if (!isUnique)
				break;
		}

		System.out.println(isUnique ? "All elements are unique" : "Duplicates found");
	}
}
