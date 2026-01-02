package my.collection.arraylist.practice;

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		nums.add(40);
//		nums.add(50);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		if(size>0) {
		for(int i = 0; i<size; i++) {
			System.out.println("Enter element "+(i+1)+": ");
			int element = sc.nextInt();
			nums.add(element);
		}
		}else {
			System.err.println("Size should be greater than 0");
		}
		
		System.out.println("Before: " + nums);
		
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		if(index>size) {
			System.err.println("Index not found!");
			sc.close();
			return;
		}

		System.out.println("Enter element: ");
		int element = sc.nextInt();

		nums.set(index, element);

		System.out.println("After: " + nums);
	}
}
