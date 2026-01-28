package my.collection.linkedlist.practice;

import java.util.*;

public class Ex24 {
	static class Bid {
		String bidderName;
		int bidAmount;

		Bid(String bidderName, int bidAmount) {
			this.bidderName = bidderName;
			this.bidAmount = bidAmount;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Live Auction Bid Tracker!");

		System.out.print("Enter number of bids: ");
		int n = sc.nextInt();
		sc.nextLine();

		LinkedList<Bid> bids = new LinkedList<>();

		System.out.println("Enter each bid in format: <bidAmount> <bidderName>");
		for (int i = 0; i < n; i++) {
			int bidAmount = sc.nextInt();
			String bidderName = sc.next();
			bids.add(new Bid(bidderName, bidAmount));
		}

		System.out.print("Enter number of cancellation requests: ");
		int m = sc.nextInt();
		sc.nextLine();

		if (m > 0) {
			System.out.println("Enter bidder names to cancel their bids:");
			for (int i = 0; i < m; i++) {
				String cancelBidder = sc.nextLine();
				boolean removed = false;
				Iterator<Bid> iterator = bids.iterator();
				while (iterator.hasNext()) {
					Bid bid = iterator.next();
					if (bid.bidderName.equals(cancelBidder)) {
						iterator.remove();
						removed = true;
						System.out.println("Cancelled bid for: " + cancelBidder);
						break;
					}
				}
				if (!removed) {
					System.out.println("No bid found for: " + cancelBidder);
				}
			}
		}

		bids.sort((b1, b2) -> b2.bidAmount - b1.bidAmount);

		System.out.println("\nUpdated Bid List (Highest First):");
		if (bids.isEmpty()) {
			System.out.println("No active bids available.");
		} else {
			for (Bid bid : bids) {
				System.out.println(bid.bidderName + " " + bid.bidAmount);
			}
		}

		sc.close();
		System.out.println("\nThank you for using the Live Auction Bid Tracker!");
	}
}
