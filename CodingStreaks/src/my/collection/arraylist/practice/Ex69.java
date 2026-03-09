package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int maxProd = list.get(0);
		int minProd = list.get(0);
		int result = list.get(0);

		for (int i = 1; i < list.size(); i++) {

			int val = list.get(i);

			if (val < 0) {
				int temp = maxProd;
				maxProd = minProd;
				minProd = temp;
			}

			maxProd = Math.max(val, maxProd * val);
			minProd = Math.min(val, minProd * val);

			result = Math.max(result, maxProd);
		}

		System.out.println("Maximum product subarray: " + result);
	}
}