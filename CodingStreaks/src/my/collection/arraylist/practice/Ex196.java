package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex196 {

	static ArrayList<Integer> majorityElement(ArrayList<Integer> list) {
		int candidate1 = 0, candidate2 = 0;
		int count1 = 0, count2 = 0;

		// Boyer-Moore Voting Algorithm
		for (int num : list) {
			if (candidate1 == num) {
				count1++;
			} else if (candidate2 == num) {
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

		// Verify the candidates
		count1 = 0;
		count2 = 0;

		for (int num : list) {
			if (num == candidate1)
				count1++;
			else if (num == candidate2)
				count2++;
		}

		ArrayList<Integer> result = new ArrayList<>();

		if (count1 > list.size() / 3)
			result.add(candidate1);

		if (count2 > list.size() / 3)
			result.add(candidate2);

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(2);

		System.out.println("ArrayList: " + list);

		ArrayList<Integer> ans = majorityElement(list);

		if (ans.size() == 0)
			System.out.println("No majority element (> n/3)");
		else
			System.out.println("Majority element(s): " + ans);
	}
}
