package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex170 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		int k = 3;

		ArrayList<String> pairs = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] ^ arr[j]) == k) {
					pairs.add("(" + arr[i] + ", " + arr[j] + ")");
					count++;
				}
			}
		}

		System.out.println("Count = " + count);
		System.out.println("Pairs = " + pairs);
	}
}
