package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex74 {
	public static ArrayList<Integer> majorityElement(int[] arr) {

		int n = arr.length;
		int candidate1 = 0, candidate2 = 0;
		int count1 = 0, count2 = 0;

		for (int num : arr) {

			if (num == candidate1) {
				count1++;
			} else if (num == candidate2) {
				count2++;
			} else if (count1 == 0) {
				candidate1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

		for (int num : arr) {
			if (num == candidate1)
				count1++;
			if (num == candidate2)
				count2++;
		}

		ArrayList<Integer> result = new ArrayList<>();

		if (count1 > n / 3)
			result.add(candidate1);
		if (count2 > n / 3)
			result.add(candidate2);

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 3, 2, 2, 1, 1 };

		ArrayList<Integer> res = majorityElement(arr);

		System.out.println("Elements appearing more than n/3 times: " + res);
	}
}
