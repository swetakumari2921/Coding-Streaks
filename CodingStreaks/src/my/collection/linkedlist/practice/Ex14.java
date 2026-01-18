package my.collection.linkedlist.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Team class
class Team implements Comparable<Team> {
	String name;
	int score;

	Team(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// Sort teams by score in descending order
	@Override
	public int compareTo(Team t) {
		return Integer.compare(t.score, this.score);
	}
}

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Team> teams = new LinkedList<>();

		System.out.println("===== Tournament Scoreboard System =====");

		// 1. Number of teams
		System.out.print("Enter number of teams: ");
		int n = sc.nextInt();
		sc.nextLine(); // clear buffer

		// 2. Team details (SAFE INPUT)
		for (int i = 0; i < n; i++) {
			System.out.println("\nTeam " + (i + 1) + " Details:");

			System.out.print("Enter team name: ");
			String name = sc.nextLine();

			System.out.print("Enter initial score: ");
			int score = sc.nextInt();
			sc.nextLine(); // clear buffer

			teams.add(new Team(name, score));
		}

		// 3. Matches
		System.out.print("\nEnter number of matches played: ");
		int matches = sc.nextInt();
		sc.nextLine(); // clear buffer

		// 4. Update scores
		for (int i = 0; i < matches; i++) {
			System.out.println("\nMatch " + (i + 1) + " Details:");

			System.out.print("Enter winning team name: ");
			String teamName = sc.nextLine();

			System.out.print("Enter points earned: ");
			int points = sc.nextInt();
			sc.nextLine(); // clear buffer

			boolean found = false;
			for (Team t : teams) {
				if (t.name.equalsIgnoreCase(teamName)) {
					t.score += points;
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Team not found!");
			}
		}

		// 5. Sort teams
		Collections.sort(teams);

		// 6. Display Top 3 Teams
		System.out.println("\n===== Top 3 Teams =====");
		for (int i = 0; i < 3 && i < teams.size(); i++) {
			Team t = teams.get(i);
			System.out.println((i + 1) + ". " + t.name + " (" + t.score + " points)");
		}

		System.out.println("\nThank you for using the Tournament Scoreboard System!");
		sc.close();
	}
}
