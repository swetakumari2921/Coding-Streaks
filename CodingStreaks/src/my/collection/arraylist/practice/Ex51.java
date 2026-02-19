package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of friends:");
		int n = sc.nextInt();

		ArrayList<Integer> scores = new ArrayList<>();
		System.out.println("Enter the scores of each friend:");
		for (int i = 0; i < n; i++) {
			scores.add(sc.nextInt());
		}

		int maxScore = -1;
		int winnerIndex = -1;
		for (int i = 0; i < n; i++) {
			if (scores.get(i) > maxScore) {
				maxScore = scores.get(i);
				winnerIndex = i;
			}
		}

		System.out.println("The winning friend index (0-based) is: " + winnerIndex);
	}
}
