package my.vector.practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> v = new Vector<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			v.add(sc.nextInt());
		}

		System.out.println("Vector: " + v);
		System.out.println("Size of vector: " + v.size());

		sc.close();
	}
}
