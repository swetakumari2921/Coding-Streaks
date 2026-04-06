package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex98 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> common = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(2);
		list2.add(3);
		list2.add(5);
		list3.add(3);
		list3.add(2);
		list3.add(6);

		for (int i = 0; i < list1.size(); i++) {
			int val = list1.get(i);
			if (list2.contains(val) && list3.contains(val) && !common.contains(val)) {
				common.add(val);
			}
		}

		System.out.println("Common elements: " + common);
	}
}
