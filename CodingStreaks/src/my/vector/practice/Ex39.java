package my.vector.practice;

import java.util.Vector;

public class Ex39 {

	public static int majorityElement(Vector<Integer> nums) {
		int candidate = 0;
		int count = 0;

		// Find candidate
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}

			if (num == candidate)
				count++;
			else
				count--;
		}

		// Verify candidate
		count = 0;
		for (int num : nums) {
			if (num == candidate)
				count++;
		}

		if (count > nums.size() / 2)
			return candidate;

		return -1; // No majority element
	}

	public static void main(String[] args) {
		Vector<Integer> nums = new Vector<>();

		nums.add(2);
		nums.add(2);
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		nums.add(2);

		int result = majorityElement(nums);

		if (result != -1)
			System.out.println("Majority Element: " + result);
		else
			System.out.println("No Majority Element");
	}
}
