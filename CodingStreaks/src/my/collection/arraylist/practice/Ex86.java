package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex86 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);

		int i = 0;
		int j = list.size() - 1;
		boolean isPalindrome = true;

		while (i < j) {
			if (!list.get(i).equals(list.get(j))) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}

		System.out.println(isPalindrome);
	}
}
