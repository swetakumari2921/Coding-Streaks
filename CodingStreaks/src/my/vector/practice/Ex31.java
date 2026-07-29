package my.vector.practice;

import java.util.Vector;
import java.util.HashSet;

public class Ex31 {

	public static Vector<Integer> findRepeatingElements(Vector<Integer> nums) {

		Vector<Integer> result = new Vector<>();

		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();

		for (int num : nums) {

			if (seen.contains(num)) {
				duplicate.add(num);
			} else {
				seen.add(num);
			}
		}

		result.addAll(duplicate);

		return result;
	}

	public static void main(String[] args) {

		Vector<Integer> nums = new Vector<>();

		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(20);
		nums.add(40);
		nums.add(10);
		nums.add(50);
		nums.add(30);

		Vector<Integer> ans = findRepeatingElements(nums);

		System.out.println("Repeating Elements: " + ans);
	}
}
