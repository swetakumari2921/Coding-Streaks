package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of songs:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter song name:");
			String song = sc.nextLine();
			list.add(0, song);
		}

		System.out.println("Playlist:");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
