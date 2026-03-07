package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class Ex67 {

	public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {

		intervals.sort(Comparator.comparingInt(i -> i.start));

		ArrayList<Interval> result = new ArrayList<>();

		for (Interval interval : intervals) {

			if (result.isEmpty() || result.get(result.size() - 1).end < interval.start) {
				result.add(interval);
			} else {
				result.get(result.size() - 1).end = Math.max(result.get(result.size() - 1).end, interval.end);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Interval> list = new ArrayList<>();

		System.out.println("Enter number of intervals:");
		int n = sc.nextInt();

		System.out.println("Enter intervals (start end):");
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			list.add(new Interval(s, e));
		}

		ArrayList<Interval> merged = mergeIntervals(list);

		System.out.println("Merged Intervals:");
		for (Interval in : merged) {
			System.out.println(in.start + " " + in.end);
		}
	}
}
