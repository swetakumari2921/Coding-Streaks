package my.collection.arraylist.practice;

import java.util.*;

public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Live Auction Bid Tracker!");

		System.out.print("Enter number of bids: ");
		int n = sc.nextInt();
		sc.nextLine(); 

		Map<String, Integer> bids = new HashMap<>();

		System.out.println("Enter each bid in format: <bidAmount> <bidderName>");
		for (int i = 0; i < n; i++) {
			int bidAmount = sc.nextInt();
			String bidderName = sc.next();
			bids.put(bidderName, bidAmount);
		}

		System.out.print("Enter number of cancellation requests: ");
		int m = sc.nextInt();
		sc.nextLine(); 

		if (m > 0) {
			System.out.println("Enter bidder names to cancel their bids:");
			for (int i = 0; i < m; i++) {
				String cancelBidder = sc.nextLine();
				if (bids.containsKey(cancelBidder)) {
					bids.remove(cancelBidder);
					System.out.println("Cancelled bid for: " + cancelBidder);
				} else {
					System.out.println("No bid found for: " + cancelBidder);
				}
			}
		}

		List<Map.Entry<String, Integer>> sortedBids = new ArrayList<>(bids.entrySet());
		sortedBids.sort((a, b) -> b.getValue() - a.getValue());

		System.out.println("\nUpdated Bid List (Highest First):");
		if (sortedBids.isEmpty()) {
			System.out.println("No active bids available.");
		} else {
			for (Map.Entry<String, Integer> entry : sortedBids) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

		sc.close();
		System.out.println("\nThank you for using the Live Auction Bid Tracker!");
	}
}
