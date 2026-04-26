package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex119 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		ArrayList<Integer> list = new ArrayList<>();

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			if (start != end) {
				list.add(arr[end]);
				list.add(arr[start]);
			} else {
				list.add(arr[start]);
			}
			start++;
			end--;
		}

		System.out.println(list);
	}
}
