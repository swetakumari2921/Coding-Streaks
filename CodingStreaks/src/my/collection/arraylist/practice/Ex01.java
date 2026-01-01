package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element: ");
			int element = sc.nextInt();
			nums.add(element);
		}

		System.out.println("Size: " + size);

		System.out.print("Elements: ");
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
	}
}
