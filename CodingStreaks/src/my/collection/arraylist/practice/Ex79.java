package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex79 {

	public static int findDuplicate(ArrayList<Integer> nums) {
		int slow = nums.get(0);
		int fast = nums.get(0);

		do {
			slow = nums.get(slow);
			fast = nums.get(nums.get(fast));
		} while (slow != fast);

		slow = nums.get(0);
		while (slow != fast) {
			slow = nums.get(slow);
			fast = nums.get(fast);
		}

		return slow;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		int[] arr = { 1, 3, 4, 2, 2 };
		for (int num : arr)
			nums.add(num);

		System.out.println("Duplicate number is: " + findDuplicate(nums));
	}
}
